package com.scottxuan.create.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoxuan
 */
public enum PayTypeEnum {
    WECHAT(1,"微信支付"),
    ALIPAY(2,"支付宝支付"),
    ;

    private int payType;
    private String payName;

    PayTypeEnum(int payType,String payName){
        this.payType = payType;
        this.payName = payName;
    }

    public static Map<Integer,String> toPair(){
        HashMap pairs = new HashMap<Integer, String>();
        for (PayTypeEnum value : PayTypeEnum.values()) {
            pairs.put(value.payType,value.payName);
        }
        return pairs;
    }

    public int getPayType() {
        return payType;
    }

    public String getPayName() {
        return payName;
    }

    public static PayTypeEnum getByType(int payType){
        for (PayTypeEnum value : PayTypeEnum.values()) {
            if (value.payType == payType) {
                return value;
            }
        }
        return null;
    }
}
