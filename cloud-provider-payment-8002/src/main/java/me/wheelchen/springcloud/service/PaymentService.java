package me.wheelchen.springcloud.service;

import me.wheelchen.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Kelvin Chen
 * @date 2020-06-11 00:14:38
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
