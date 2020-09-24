package com.scottxuan.behavior.coupon;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
public class InsuranceCouponStrategy extends AbstractCouponStrategy{
    private BigDecimal insuranceCoupon;

    private InsuranceCouponStrategy() {
    }

    public InsuranceCouponStrategy(BigDecimal insuranceCoupon, BigDecimal costPrice) {
        super.costPrice = costPrice;
        this.insuranceCoupon = insuranceCoupon;
    }

    @Override
    public BigDecimal couponAmount() {
        if (insuranceCoupon == null){
            return new BigDecimal(0);
        }
        return null;
    }
}
