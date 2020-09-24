package com.scottxuan.behavior.coupon;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class CashCouponStrategy extends AbstractCouponStrategy {
    private BigDecimal cashCoupon;

    private CashCouponStrategy() {
    }

    public CashCouponStrategy(BigDecimal cashCoupon,BigDecimal costPrice) {
        super.costPrice = costPrice;
        this.cashCoupon = cashCoupon;
    }

    @Override
    public BigDecimal couponAmount() {
        if (cashCoupon == null){
            return new BigDecimal(0);
        }
        return null;
    }

}
