package me.wheelchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Kelvin Chen
 * @date 2020-06-16 09:35:59
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentConsulApplication8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication8006.class, args);
    }
}
