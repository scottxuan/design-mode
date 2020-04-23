package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        ComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        Computer lenovoComputer = lenovoComputerFactory.createComputer();
        lenovoComputer.show();

        ComputerFactory asusComputerFactory = new AsusComputerFactory();
        Computer asusComputer = asusComputerFactory.createComputer();
        asusComputer.show();
    }
}
