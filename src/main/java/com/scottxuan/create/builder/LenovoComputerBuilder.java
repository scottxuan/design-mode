package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 * 具体的建造者联想
 */
public class LenovoComputerBuilder extends ComputerBuilder {
    void buildCPU() {
        super.computer.setCPU("联想CPU");
    }

    void buildVideoCard() {
        super.computer.setVideoCard("联想显卡");
    }

    void buildMemory() {
        super.computer.setMemory("联想内存条");
    }
}
