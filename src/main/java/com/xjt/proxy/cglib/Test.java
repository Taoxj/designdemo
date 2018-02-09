package com.xjt.proxy.cglib;

/**
 * Created by Kevin on 2018/1/22.
 */
public class Test {

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new CglibProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
