package com.scottxuan.create.simplefactory;

import java.util.Map;

/**
 * @author : zhaoxuan
 */
public class Customer {
    public static void main(String[] args) {
        //前端获取支付方式
        Map map = PayTypeEnum.toPair();
        System.out.println(map.toString());
        //客户选择支付方式
        int customerPayType = PayTypeEnum.WECHAT.getPayType();
        System.out.println("客户选择:" + PayTypeEnum.getByType(customerPayType).getPayName());
        //根据客户选择的支付方式
        AbstractPay pay = PayFactory.getPay(customerPayType);
        pay.anOrder();

        //客户选择支付方式
        int payType = PayTypeEnum.ALIPAY.getPayType();
        System.out.println("客户选择:" + PayTypeEnum.getByType(payType).getPayName());
        //根据客户选择的支付方式
        AbstractPay pay2 = PayFactory.getPay(payType);
        pay2.anOrder();
    }
}
