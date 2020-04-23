package com.scottxuan.create.factorymethod;

/**
 * @author : zhaoxuan
 */
public class AsusComputerFactory extends ComputerFactory {
    Computer createComputer() {
        return new AsusComputer();
    }
}
