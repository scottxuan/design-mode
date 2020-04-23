package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class Customer {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Product1Factory();
        AbstractProduct product1 = factory1.createProduct();
        product1.onProduct();

        AbstractFactory factory2 = new Product2Factory();
        AbstractProduct product2 = factory2.createProduct();
        product2.onProduct();
    }
}
