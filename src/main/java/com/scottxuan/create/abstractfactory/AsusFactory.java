package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * 华硕工厂
 */
public class AsusFactory extends AbstractFactory {
    CPU createCPU() {
        return new AsusCPU();
    }

    VideoCard createVideoCard() {
        return new AsusVideoCard();
    }

    Memory createMemory() {
        return new AsusMemory();
    }
}
