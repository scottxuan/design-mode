package com.scottxuan.behavior.coupon;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
public class PlatCouponStrategy extends AbstractCouponStrategy {

    private BigDecimal platDiscount;

    private PlatCouponStrategy() {
    }

    public PlatCouponStrategy(BigDecimal platDiscount, BigDecimal costPrice) {
        super.costPrice = costPrice;
        this.platDiscount = platDiscount;
    }

    @Override
    public BigDecimal couponAmount() {
        if (platDiscount == null){
            return new BigDecimal(0);
        }
        return null;
    }
}
