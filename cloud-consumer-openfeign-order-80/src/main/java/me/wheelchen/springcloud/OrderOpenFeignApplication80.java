package me.wheelchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Kelvin Chen
 * @date 2020-06-17 11:01:01
 */
@EnableFeignClients
@SpringBootApplication
public class OrderOpenFeignApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication80.class, args);
    }
}
