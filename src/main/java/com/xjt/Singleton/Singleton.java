package com.xjt.Singleton;

/**
 * 单例模式的常用写法，面试时最好写这种
 */
public class Singleton {

    private static Singleton instance = null;

    public Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                //当一个线程还没有实例化Singleton时另一个线程执行到
                // if(instance==null)这个判断语句时就会进入if语句，虽然加了锁，
                // 但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，
                // 另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //注：我们进行了两次if (instance== null)检查，
    //这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，
    //判断if (instance== null)，直接return实例化对象。
}
