package com.scottxuan.structure.adapter.object;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        //本来需要两个类来调用,适配之后仅需要一个类即可
        SortAdapter adapter = new SortAdapter();
        adapter.sort1();
        adapter.sort2();
    }
}
