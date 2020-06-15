package me.wheelchen.springcloud;

import cn.hutool.db.sql.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Kelvin Chen
 * @date 2020-06-15 17:20:34
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderZkApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication80.class, args);
    }
}
