package com.scottxuan.create.simplefactory;

import java.util.Map;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        //前端获取支付方式
        Map map = PayTypeEnum.toPair();
        System.out.println(map.toString());
        //客户选择支付方式
        int payType = PayTypeEnum.WECHAT.getPayType();
        System.out.println("客户第一次选择:" + payType);
        //根据客户选择的支付方式
        AbstractPay pay = PayFactory.getPay(payType);
        pay.anOrder();

        //客户选择支付方式
        int payType1 = PayTypeEnum.ALIPAY.getPayType();
        System.out.println("客户第二次选择:" + payType1);
        //根据客户选择的支付方式
        AbstractPay pay2 = PayFactory.getPay(payType1);
        pay2.anOrder();
    }
}
