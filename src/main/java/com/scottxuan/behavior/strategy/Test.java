package com.scottxuan.behavior.strategy;

import java.math.BigDecimal;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Product product = new Product(1,new BigDecimal(100));
        Activity activity = ActivityEnum.getClazz(product.getType()).newInstance();
        activity.setPrice(product.getPrice());
        activity.calculate();
    }
}
