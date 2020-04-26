package com.scottxuan.behavior.observer;

/**
 * @author : zhaoxuan
 */
public class Target extends AbstractTarget {
    public Target(IObserver iObserver) {
        super.iObserver = iObserver;
    }

    @Override
    void changeStatus() {
        System.out.println("目标状态发生改变");
        iObserver.observer();
    }
}
