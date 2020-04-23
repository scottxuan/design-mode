package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Customer {
    public static void main(String[] args) {
        AbstractProduct1 product1;
        AbstractProduct2 product2;
        AbstractProduct3 product3;
        AbstractFactory factory1 = new Group1Factory();
        product1 = factory1.createProduct1();
        product2 = factory1.createProduct2();
        product3 = factory1.createProduct3();
        product1.showProduct1();
        product2.showProduct2();
        product3.showProduct3();

        AbstractFactory factory2 = new Group2Factory();
        product1 = factory2.createProduct1();
        product2 = factory2.createProduct2();
        product3 = factory2.createProduct3();
        product1.showProduct1();
        product2.showProduct2();
        product3.showProduct3();
    }
}
