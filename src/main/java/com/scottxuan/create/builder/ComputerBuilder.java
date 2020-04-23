package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class ComputerBuilder {
    Computer build(ComputerCondition condition){
        condition.setCpu();
        condition.setVideoCard();
        condition.setMemory();
        return condition.getComputer();
    }
}
