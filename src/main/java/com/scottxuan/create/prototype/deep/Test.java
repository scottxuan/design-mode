package com.scottxuan.create.prototype.deep;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CPU cpu = new CPU();
        VideoCard videoCard = new VideoCard();
        Memory memory = new Memory();
        Computer computer = new Computer(cpu,videoCard,memory);
        Computer computer1 = computer.deepClone();
        System.out.println(computer == computer1);
        System.out.println(cpu == computer1.getCpu());
        System.out.println(videoCard == computer1.getVideoCard());
        System.out.println(memory == computer1.getMemory());
    }
}
