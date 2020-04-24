package com.scottxuan.structure.bridge;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class Test {
    public static void main(String[] args) {
        Pen pen = new PenGangBi(new ColorRed());
        pen.write();
    }
}
