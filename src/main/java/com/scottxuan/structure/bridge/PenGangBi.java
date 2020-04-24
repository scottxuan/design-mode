package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 */
public class PenGangBi extends Pen {

    public PenGangBi(Color color) {
        super(color);
    }

    @Override
    void write() {
        System.out.println("钢笔字 : " + color.color());
    }
}
