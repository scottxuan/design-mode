package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class AsusComputerCondition extends ComputerCondition {
    void setCpu() {
        super.computer.setCPU("华硕CPU");
    }

    void setVideoCard() {
        super.computer.setVideoCard("华硕显卡");
    }

    void setMemory() {
        super.computer.setMemory("华硕内存条");
    }
}
