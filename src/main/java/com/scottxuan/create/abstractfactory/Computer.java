package com.scottxuan.create.abstractfactory;

import lombok.AllArgsConstructor;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
@AllArgsConstructor
public class Computer {
    private CPU cpu;
    private VideoCard videoCard;
    private Memory memory;

    public void show(){
        cpu.show();
        videoCard.show();
        memory.show();
    }
}
