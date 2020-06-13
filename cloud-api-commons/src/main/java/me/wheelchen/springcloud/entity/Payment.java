package me.wheelchen.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Kelvin Chen
 * @date 2020-06-10 23:03:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 支付表主键
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;
}
