package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Group2Factory extends AbstractFactory {
    AbstractProduct1 createProduct1() {
        return new Product1_2();
    }

    AbstractProduct2 createProduct2() {
        return new Product2_2();
    }

    AbstractProduct3 createProduct3() {
        return new Product3_2();
    }
}
