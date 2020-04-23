package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 * 抽象的建造者
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();
    abstract void buildCPU();
    abstract void buildVideoCard();
    abstract void buildMemory();
    public Computer getComputer(){
        return this.computer;
    }
}
