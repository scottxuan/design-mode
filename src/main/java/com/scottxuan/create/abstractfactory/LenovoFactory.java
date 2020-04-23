package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * 联想工厂
 */
public class LenovoFactory extends AbstractFactory {
    CPU createCPU() {
        return new LenovoCPU();
    }

    VideoCard createVideoCard() {
        return new LenovoVideoCard();
    }

    Memory createMemory() {
        return new LenovoMemory();
    }
}
