package com.scottxuan.create.single;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Test {
    private CountDownLatch startGate;
    private CountDownLatch endGate;
    Test(CountDownLatch startGate,CountDownLatch endGate){
        this.startGate = startGate;
        this.endGate = endGate;
    }

    public static void main(String[] args) {
        final int N = 10000; // 线程数
        Test test = new Test(new CountDownLatch(1),new CountDownLatch(N));
        test.doTest(N);
    }

    public long doTest(int N){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for(int i=0;i<N;i++){
            new Thread(new SingleRunnable(cyclicBarrier)).start();
        }
        long start = System.currentTimeMillis();
        //所有阻塞的任务同时开始
        startGate.countDown();
        try {
            //主线程阻塞,等待其他所有 worker 线程完成后再执行
            startGate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时: " + (end - start) + "ms");
        return end - start;
    }
}
