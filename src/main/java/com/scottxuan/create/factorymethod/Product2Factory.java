package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class Product2Factory extends AbstractFactory {
    AbstractProduct createProduct() {
        return new Product2();
    }
}
