package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class Product1Factory extends AbstractFactory {
    AbstractProduct createProduct() {
        return new Product1();
    }
}
