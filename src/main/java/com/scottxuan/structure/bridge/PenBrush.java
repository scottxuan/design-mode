package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 */
public class PenBrush extends Pen {
    @Override
    void write() {
        System.out.println("毛笔字 : " + color.color());
    }
}
