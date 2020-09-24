package com.scottxuan.behavior.coupon.core;

import com.scottxuan.behavior.coupon.*;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author : pc
 * @date : 2020/9/24
 */
@Getter
public class CouponHandler {
    private CouponBo couponBo;

    private CouponHandler() {
    }

    public CouponHandler(CouponBo couponBo) {
        this.couponBo = couponBo;
    }

    public BigDecimal doHandler(BigDecimal oldAmount){
        Integer beanNum = couponBo.getBeans();
        CouponContext beanContext = new CouponContext(new BeanCouponStrategy(beanNum,oldAmount));
        BigDecimal couponAmount1 = beanContext.couponAmount();
        BigDecimal afterCouponAmount1 = beanContext.afterCouponAmount();

        BigDecimal couponNum = couponBo.getCashCoupon();
        CouponContext cashCouponContext = new CouponContext(new CashCouponStrategy(couponNum,oldAmount));
        BigDecimal couponAmount2 = cashCouponContext.couponAmount();
        BigDecimal afterCouponAmount2 = cashCouponContext.afterCouponAmount();

        BigDecimal insuranceNum = couponBo.getInsuranceCoupon();
        CouponContext insuranceCouponContext = new CouponContext(new InsuranceCouponStrategy(insuranceNum,oldAmount));
        BigDecimal couponAmount3 = insuranceCouponContext.couponAmount();
        BigDecimal afterCouponAmount3 = insuranceCouponContext.afterCouponAmount();

        BigDecimal platDiscount = couponBo.getPlatDiscount();
        CouponContext platCouponContext = new CouponContext(new PlatCouponStrategy(platDiscount,oldAmount));
        BigDecimal couponAmount4 = platCouponContext.couponAmount();
        BigDecimal afterCouponAmount4 = platCouponContext.afterCouponAmount();

        BigDecimal memberDiscount = couponBo.getMemberDiscount();
        CouponContext memberCouponContext = new CouponContext(new MemberCouponStrategy(memberDiscount,oldAmount));
        BigDecimal couponAmount5 = memberCouponContext.couponAmount();
        BigDecimal afterCouponAmount5 = memberCouponContext.afterCouponAmount();

        return oldAmount;
    }
}
