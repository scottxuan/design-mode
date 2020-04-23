package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        ComputerProducer producer = new ComputerProducer();
        Computer computer = producer.productConputer(new LenovoComputerBuilder());
        System.out.println(computer.toString());
        Computer computer1 = producer.productConputer(new AsusComputerBuilder());
        System.out.println(computer1.toString());
    }
}
