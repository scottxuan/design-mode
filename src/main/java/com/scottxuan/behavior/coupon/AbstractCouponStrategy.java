package com.scottxuan.behavior.coupon;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Data
public abstract class AbstractCouponStrategy implements CouponStrategy {
    protected BigDecimal costPrice;

    @Override
    public BigDecimal afterCouponAmount() {
        return costPrice.subtract(couponAmount());
    }
}
