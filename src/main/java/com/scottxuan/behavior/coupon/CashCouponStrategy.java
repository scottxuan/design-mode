package com.scottxuan.behavior.coupon;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class CashCouponStrategy implements CouponStrategy {
    private BigDecimal couponAmount;

    private CashCouponStrategy() {
    }

    public CashCouponStrategy(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Override
    public BigDecimal couponAmount(BigDecimal amount) {
        if (couponAmount == null){
            return amount;
        }
        return null;
    }

}
