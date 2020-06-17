package me.wheelchen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import me.wheelchen.springcloud.common.CommonResult;
import me.wheelchen.springcloud.entity.Payment;
import me.wheelchen.springcloud.service.PaymentOpenfeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kelvin Chen
 * @date 2020-06-17 11:12:54
 */
@Slf4j
@RestController
public class OrderController {
    @Resource
    private PaymentOpenfeignService paymentOpenfeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentOpenfeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //客户端默认等待1s
        return paymentOpenfeignService.paymentFeignTimeout();
    }
}
