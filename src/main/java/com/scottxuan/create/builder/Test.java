package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder.build(new LenovoComputerCondition());
        System.out.println(computer.toString());
        Computer computer1 = builder.build(new AsusComputerCondition());
        System.out.println(computer1.toString());
    }
}
