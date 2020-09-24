package com.scottxuan.behavior.coupon;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
public interface CouponStrategy {

    /**
     * 优惠金额
     * @return
     */
    BigDecimal couponAmount();

    /**
     * 优惠后金額
     * @return
     */
    BigDecimal afterCouponAmount();
}
