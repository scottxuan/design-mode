package com.scottxuan.create.single;

import com.scottxuan.create.single.hungrysingle.Singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
public class Test {
    private CountDownLatch endGate;
    Test(CountDownLatch endGate){
        this.endGate = endGate;
    }

    public static void main(String[] args) {
        final int N = 20000; // 线程数
        CountDownLatch latch = new CountDownLatch(N);
        Test test = new Test(latch);
        test.doTest(N,latch);
        test.getLongTime();
    }

    public void doTest(int N,CountDownLatch latch ){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for(int i=0;i<N;i++){
            new Thread(new SingleRunnable(cyclicBarrier,latch)).start();
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
