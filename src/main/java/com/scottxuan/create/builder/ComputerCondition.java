package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 * 抽象的建造者
 */
public abstract class ComputerCondition {
    protected Computer computer = new Computer();
    abstract void setCpu();
    abstract void setVideoCard();
    abstract void setMemory();
    public Computer getComputer(){
        return this.computer;
    }
}
