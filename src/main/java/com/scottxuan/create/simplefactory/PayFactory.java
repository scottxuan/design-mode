package com.scottxuan.create.simplefactory;

import static com.scottxuan.create.simplefactory.PayTypeEnum.*;

/**
 * @author : zhaoxuan
 */
public class PayFactory {
    public static AbstractPay getPay(int payType){
        PayTypeEnum typeEnum = getByType(payType);
        AbstractPay pay = null;
        if (typeEnum!=null) {
            switch (typeEnum) {
                case WECHAT:
                    pay = new WeChatPay();
                    break;
                case ALIPAY:
                    pay = new AlipayPay();
                    break;
                default:
            }
        }
        return pay;
    }
}
