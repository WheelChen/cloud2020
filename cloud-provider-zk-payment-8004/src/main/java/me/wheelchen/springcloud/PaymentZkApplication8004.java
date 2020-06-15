package me.wheelchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Kelvin Chen
 * @date 2020-06-15 14:18:56
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentZkApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZkApplication8004.class, args);
    }
}
