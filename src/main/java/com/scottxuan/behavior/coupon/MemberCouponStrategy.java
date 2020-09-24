package com.scottxuan.behavior.coupon;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class MemberCouponStrategy implements CouponStrategy {
    private Integer customerId;

    private MemberCouponStrategy() {
    }

    public MemberCouponStrategy(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public BigDecimal couponAmount(BigDecimal amount) {
        if (customerId==null) {
            return amount;
        }
        return null;
    }
}
