package com.scottxuan.structure.proxy;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class RealSearch implements Search{
    @Override
    public void search() {
        System.out.println("RealSearch-->search");
    }
}
