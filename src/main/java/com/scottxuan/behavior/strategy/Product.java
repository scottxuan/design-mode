package com.scottxuan.behavior.strategy;

import java.math.BigDecimal;

/**
 * @author : zhaoxuan
 */
public class Product {
    private int type;
    private BigDecimal price;

    public Product(int type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    int getType(){
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
