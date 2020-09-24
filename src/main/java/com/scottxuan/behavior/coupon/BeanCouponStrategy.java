package com.scottxuan.behavior.coupon;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class BeanCouponStrategy extends AbstractCouponStrategy{

    private Integer beans;

    private BeanCouponStrategy() {
    }

    public BeanCouponStrategy(Integer beans,BigDecimal costPrice) {
        super.costPrice = costPrice;
        this.beans = beans;
    }

    @Override
    public BigDecimal couponAmount() {
        if (beans == null){
            return new BigDecimal(0);
        }
        System.out.println("喜鹊豆兑换");
        return null;
    }
}
