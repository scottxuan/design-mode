package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class LenovoComputerFactory extends ComputerFactory {
    Computer createComputer() {
        return new LenovoComputer();
    }
}
