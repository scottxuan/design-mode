package com.scottxuan.behavior.coupon.core;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Data
public class CouponBo {
    private Integer beans;
    private BigDecimal cashCoupon;
    private BigDecimal insuranceCoupon;
    private BigDecimal platDiscount;
    private BigDecimal memberDiscount;

    private CouponBo() {
    }
}
