package com.scottxuan.behavior.observer;

/**
 * @author : zhaoxuan
 */
public class Observer implements IObserver {
    @Override
    public void observer() {
        System.out.println("目标转移,迅速离开");
    }
}
