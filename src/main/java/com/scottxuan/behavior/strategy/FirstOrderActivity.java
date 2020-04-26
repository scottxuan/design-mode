package com.scottxuan.behavior.strategy;

import java.math.BigDecimal;

/**
 * @author : zhaoxuan
 */
public class FirstOrderActivity extends Activity{

    @Override
    void calculate() {
        BigDecimal decimal = new BigDecimal(5);
        System.out.println("首单价:" + decimalFormat.format(price.subtract(decimal)));
    }
}
