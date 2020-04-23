package com.scottxuan.create.builder;

import lombok.Data;

/**
 * @author : zhaoxuan
 */
@Data
public class Computer {
    private String CPU;//CPU
    private String videoCard;//显卡
    private String memory;//内存条

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
