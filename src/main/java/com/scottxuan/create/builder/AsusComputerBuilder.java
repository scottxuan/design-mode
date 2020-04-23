package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 * 具体的建造者华硕
 */
public class AsusComputerBuilder extends ComputerBuilder {
    void buildCPU() {
        super.computer.setCPU("华硕CPU");
    }

    void buildVideoCard() {
        super.computer.setVideoCard("华硕显卡");
    }

    void buildMemory() {
        super.computer.setMemory("华硕内存条");
    }
}
