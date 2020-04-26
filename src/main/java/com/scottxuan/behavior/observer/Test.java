package com.scottxuan.behavior.observer;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        IObserver observer = new Observer();
        AbstractTarget target = new Target(observer);
        target.changeStatus();
    }
}
