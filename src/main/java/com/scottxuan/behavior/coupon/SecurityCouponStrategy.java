package com.scottxuan.behavior.coupon;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class SecurityCouponStrategy implements CouponStrategy{
    private BigDecimal insuranceAmount;

    private SecurityCouponStrategy() {
    }

    public SecurityCouponStrategy(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public BigDecimal couponAmount(BigDecimal amount) {
        return null;
    }
}
