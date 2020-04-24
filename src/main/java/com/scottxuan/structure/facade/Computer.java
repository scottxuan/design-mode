package com.scottxuan.structure.facade;

/**
 * @author : zhaoxuan
 */
public class Computer {
    private CPU cpu;
    private VideoCard videoCard;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        videoCard = new VideoCard();
        memory = new Memory();
    }

    public void show(){
        cpu.show();
        videoCard.show();
        memory.show();
    }
}