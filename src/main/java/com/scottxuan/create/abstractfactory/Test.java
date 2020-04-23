package com.scottxuan.create.abstractfactory;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory lenovoFactory = new LenovoFactory();
        AbstractFactory asusFactory = new AsusFactory();

        CPU cpu = lenovoFactory.createCPU();
        Memory memory = lenovoFactory.createMemory();
        VideoCard videoCard = asusFactory.createVideoCard();

        Computer computer = new Computer(cpu,videoCard,memory);
        computer.show();
    }
}
