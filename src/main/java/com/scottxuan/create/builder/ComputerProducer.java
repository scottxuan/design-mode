package com.scottxuan.create.builder;

/**
 * @author : zhaoxuan
 */
public class ComputerProducer {
    Computer productConputer(ComputerBuilder builder){
        builder.buildCPU();
        builder.buildVideoCard();
        builder.buildMemory();
        return builder.getComputer();
    }
}
