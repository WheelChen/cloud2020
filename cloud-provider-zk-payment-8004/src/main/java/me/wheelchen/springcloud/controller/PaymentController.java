package me.wheelchen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Kelvin Chen
 * @date 2020-06-15 14:21:52
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentZK() {
        return "SpringCloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
