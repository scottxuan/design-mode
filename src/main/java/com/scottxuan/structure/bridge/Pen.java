package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 */
public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void write();
}
