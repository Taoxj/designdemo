package com.xjt.Observer;

public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("第二个观察者得到了  " + msg + "   信息");
    }
}
