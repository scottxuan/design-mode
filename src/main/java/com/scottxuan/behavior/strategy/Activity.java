package com.scottxuan.behavior.strategy;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author : zhaoxuan
 */
public abstract class Activity {
    protected BigDecimal price;

    DecimalFormat decimalFormat = new DecimalFormat("0.0#");

    public void setPrice(BigDecimal price) {
        this.price =price;
    }

    abstract void calculate();
}
