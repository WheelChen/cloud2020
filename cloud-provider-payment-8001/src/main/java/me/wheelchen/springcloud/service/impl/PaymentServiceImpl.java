package me.wheelchen.springcloud.service.impl;

import me.wheelchen.springcloud.dao.PaymentDao;
import me.wheelchen.springcloud.entity.Payment;
import me.wheelchen.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Kelvin Chen
 * @date 2020-06-11 00:17:05
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
