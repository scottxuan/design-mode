package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Group1Factory extends AbstractFactory {
    AbstractProduct1 createProduct1() {
        return new Product1_1();
    }

    AbstractProduct2 createProduct2() {
        return new Product2_1();
    }

    AbstractProduct3 createProduct3() {
        return new Product3_1();
    }
}
