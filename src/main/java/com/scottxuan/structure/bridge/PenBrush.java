package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 */
public class PenBrush extends Pen {

    public PenBrush(Color color) {
        super(color);
    }

    @Override
    void write() {
        System.out.println("毛笔字 : " + color.color());
    }
}
