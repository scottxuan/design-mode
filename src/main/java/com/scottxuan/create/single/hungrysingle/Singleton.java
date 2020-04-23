package com.scottxuan.create.single.hungrysingle;

/**
 * @author : zhaoxuan
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("饿汉式单例模式初始化");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}