package com.scottxuan.behavior.coupon.core;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Data
public class CouponBo {
    private Integer customerId;
    private Integer beans;
    private BigDecimal cash;
    private BigDecimal security;

    private CouponBo() {
    }

    public CouponBo(Integer customerId) {
        this.customerId = customerId;
    }
}
