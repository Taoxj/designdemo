package com.xjt.Observer;


public class Test {

    public static void main(String[] args) {

        //模拟一个服务号
        ObjectFor3D objectFor3D = new ObjectFor3D();

        //客户1
        Observer1 observer1 = new Observer1(objectFor3D);
        Observer2 observer2 = new Observer2(objectFor3D);

        objectFor3D.setMsg("我就是我1");
        objectFor3D.setMsg("我就是我2");
    }
}
