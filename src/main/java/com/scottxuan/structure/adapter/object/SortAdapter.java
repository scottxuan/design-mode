package com.scottxuan.structure.adapter.object;

/**
 * @author : zhaoxuan
 */
public class SortAdapter {
    private Sort1 sort1;
    private Sort2 sort2;

    public SortAdapter() {
        this.sort1 = new Sort1();
        this.sort2 = new Sort2();
    }

    public void sort1(){
        sort1.sort1();
    }

    public void sort2(){
        sort2.sort2();
    }
}
