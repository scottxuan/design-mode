package com.scottxuan.behavior.observer;

/**
 * @author : zhaoxuan
 */
public abstract class AbstractTarget {
    protected IObserver iObserver;

    abstract void changeStatus();
}
