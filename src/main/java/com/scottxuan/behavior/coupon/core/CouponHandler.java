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
        CouponContext beanContext = new CouponContext(new BeanCouponStrategy(beanNum));
        BigDecimal amount1 = beanContext.handler(oldAmount);

        BigDecimal couponNum = couponBo.getCash();
        CouponContext xianJinContext = new CouponContext(new CashCouponStrategy(couponNum));
        BigDecimal amount2 = xianJinContext.handler(oldAmount);

        BigDecimal insuranceNum = couponBo.getSecurity();
        CouponContext insuranceContext = new CouponContext(new SecurityCouponStrategy(insuranceNum));
        BigDecimal amount3 = insuranceContext.handler(oldAmount);

        CouponContext platContext = new CouponContext(new PlatCouponStrategy());
        BigDecimal amount4 = platContext.handler(oldAmount);

        Integer customerId = couponBo.getCustomerId();
        CouponContext memberContext = new CouponContext(new MemberCouponStrategy(customerId));
        BigDecimal amount5 = memberContext.handler(oldAmount);

        return oldAmount.subtract(amount1).subtract(amount2).subtract(amount3).subtract(amount4).subtract(amount5);
    }
}
