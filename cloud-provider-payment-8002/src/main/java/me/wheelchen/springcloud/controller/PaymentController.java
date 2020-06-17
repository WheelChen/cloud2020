package me.wheelchen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import me.wheelchen.springcloud.common.CommonResult;
import me.wheelchen.springcloud.entity.Payment;
import me.wheelchen.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kelvin Chen
 * @date 2020-06-12 00:16:06
 */
@RestController
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果："  + result);

        if (result > 0) {
            return new CommonResult(200, "插入成功, serverPort: " + serverPort, result);
        }
        else  {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        log.info("***插入结果："  + payment);
        log.info("3aaa");

        if (payment != null) {
            return new CommonResult(200, "查询成功, serverPort: " + serverPort, payment);
        }
        else  {
            return new CommonResult(444, "没有对应记录, 查询ID: " + id, null);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
