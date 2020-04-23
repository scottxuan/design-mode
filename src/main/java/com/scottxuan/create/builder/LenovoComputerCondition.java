package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class LenovoComputerCondition extends ComputerCondition {
    void setCpu() {
        super.computer.setCPU("联想CPU");
    }

    void setVideoCard() {
        super.computer.setVideoCard("联想显卡");
    }

    void setMemory() {
        super.computer.setMemory("联想内存条");
    }
}
