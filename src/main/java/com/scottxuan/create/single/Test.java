package com.scottxuan.create.single;

import com.scottxuan.create.single.hungrysingle.Singleton;

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
        test.getLongTime();
    }

    public void doTest(int N){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for(int i=0;i<N;i++){
            new Thread(new SingleRunnable(cyclicBarrier)).start();
        }
    }

    public long getLongTime(){
        long start = System.currentTimeMillis();
        try {
            //主线程阻塞,等待其他所有 worker 线程完成后再执行
            endGate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时: " + (end - start) + "ms");
        return end - start;
    }
}
