package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 */
public abstract class AbstractFactory {
    abstract CPU createCPU();
    abstract VideoCard createVideoCard();
    abstract Memory createMemory();
}
