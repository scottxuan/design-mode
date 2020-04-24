package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 */
public class PenGangBi extends Pen {
    @Override
    void write() {
        System.out.println("钢笔字 : " + color.color());
    }
}
