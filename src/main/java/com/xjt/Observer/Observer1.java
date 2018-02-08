package com.xjt.Observer;

/**
 * 模拟两个使用者，①
 */
public class Observer1 implements Observer {

    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("第一个观察者得到了  " + msg + "   信息");
    }
}
