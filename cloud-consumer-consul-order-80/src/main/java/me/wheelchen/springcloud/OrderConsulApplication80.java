package me.wheelchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Kelvin Chen
 * @date 2020-06-16 10:01:07
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsulApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulApplication80.class, args);
    }
}
