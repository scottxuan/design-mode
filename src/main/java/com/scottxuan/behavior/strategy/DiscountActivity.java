package com.scottxuan.behavior.strategy;

import java.math.BigDecimal;

/**
 * @author : zhaoxuan
 */
public class DiscountActivity extends Activity {

    @Override
    void calculate() {
        BigDecimal decimal = new BigDecimal(0.8);
        price.multiply(decimal);
        System.out.println("折扣价:" + decimalFormat.format(price.multiply(decimal)));
    }
}
