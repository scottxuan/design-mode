package com.scottxuan.behavior.coupon;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
public class MemberCouponStrategy extends AbstractCouponStrategy {
    private BigDecimal memberDiscount;

    private MemberCouponStrategy() {
    }

    public MemberCouponStrategy(BigDecimal memberDiscount, BigDecimal costPrice) {
        super.costPrice = costPrice;
        this.memberDiscount = memberDiscount;
    }

    @Override
    public BigDecimal couponAmount() {
        if (memberDiscount == null) {
            return new BigDecimal(0);
        }
        return null;
    }
}
