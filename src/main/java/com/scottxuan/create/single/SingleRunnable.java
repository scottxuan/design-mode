package com.scottxuan.create.single;

import com.scottxuan.create.single.hungrysingle.Singleton;
import com.scottxuan.create.single.lazysingle.LazySingleton;
import lombok.SneakyThrows;

import java.util.concurrent.CyclicBarrier;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class SingleRunnable implements Runnable {
    CyclicBarrier cyclicBarrier;
    SingleRunnable(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }
    // 饿汉式测试
//    @SneakyThrows
//    public void run() {
//        cyclicBarrier.await();
//        Singleton.getInstance();
//    }
    // 懒汉式测试1
//    @SneakyThrows
//    public void run() {
//        cyclicBarrier.await();
//        LazySingleton.getInstance1();
//    }

//    // 懒汉式测试2
//    @SneakyThrows
//    public void run() {
//        cyclicBarrier.await();
//        LazySingleton.getInstance2();
//    }

//    @SneakyThrows
//    public void run() {
//        cyclicBarrier.await();
//        LazySingleton.getInstance3();
//    }

    @SneakyThrows
    public void run() {
        cyclicBarrier.await();
        LazySingleton.getInstance4();
    }
}
