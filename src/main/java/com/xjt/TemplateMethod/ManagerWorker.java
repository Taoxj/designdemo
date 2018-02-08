package com.xjt.TemplateMethod;

public class ManagerWorker extends Worker {

    public ManagerWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "打dota...");
    }

}
