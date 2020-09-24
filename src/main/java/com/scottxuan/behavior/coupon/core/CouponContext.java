package com.scottxuan.behavior.coupon.core;

import com.scottxuan.behavior.coupon.CouponStrategy;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
public class CouponContext {
    private CouponStrategy strategy;

    private CouponContext() {
    }

    public CouponContext(CouponStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal couponAmount(){
        return strategy.couponAmount();
    }

    public BigDecimal afterCouponAmount(){
        return strategy.afterCouponAmount();
    }
}
