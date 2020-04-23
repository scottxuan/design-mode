package com.scottxuan.create.single.lazysingle;

/**
 * @author : zhaoxuan
 */
public class LazySingleton {
    private static LazySingleton lazySingleton1 = null;

    private LazySingleton() {
        System.out.println("懒汉式单例模式初始化..");
    }

    //方式一:(安全,效率低下)
    //虽然解决了线程安全问题，但是每次调用getInstance()时都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低
    synchronized public static LazySingleton getInstance1(){
        if (lazySingleton1 == null){
            lazySingleton1 = new LazySingleton();
        }
        return lazySingleton1;
    }


    //方式二:(不安全)
    //假如在某一瞬间线程A和线程B都在调用getInstance()方法,此时instance对象为null值，均能通过instance == null的判断。
    //由于实现了synchronized加锁机制，线程A进入synchronized锁定的代码中执行实例创建代码，
    //线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
    //但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象
    private static LazySingleton lazySingleton2 = null;
    public static LazySingleton getInstance2(){
        if (lazySingleton2 == null){
            synchronized (LazySingleton.class) {
                lazySingleton2 = new LazySingleton();
            }
        }
        return lazySingleton2;
    }


    //方式三:(双重锁定:安全,但效率相对也不理想)
    //注意静态成员变量必须使用volatile关键字修饰
    //由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
    private volatile static LazySingleton lazySingleton3 = null;
    public static LazySingleton getInstance3() {
        //第一重判断
        if (lazySingleton3 == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (lazySingleton3 == null) {
                    lazySingleton3 = new LazySingleton(); //创建单例实例
                }
            }
        }
        return lazySingleton3;
    }

    //方式四:(静态内部类;安全,效率高)
    public static LazySingleton getInstance4() {
        return InnerClass.lazySingleton4;
    }
    private static class InnerClass {
        private final static LazySingleton lazySingleton4 = new LazySingleton();
    }
}