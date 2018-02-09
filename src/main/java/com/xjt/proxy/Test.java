package com.xjt.proxy;

import com.example.proxy.impl.UserDao;
import com.example.proxy.impl.UserDaoProxy;

/**
 * Created by Kevin on 2018/1/22.
 */
public class Test {

    public static void main(String[] args) {
        //1.静态代理
        UserDao userDao = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(userDao);

        proxy.save();//执行的是代理的方法

        //2.动态代理
        IUserDao target = new UserDao();

        // 【原始的类型 class com.example.proxy.impl.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy2 = (IUserDao) new ProxyFactory(target).getProxyInstance();

        //看看现在的代理类型
        System.out.println(proxy2.getClass());

        proxy2.save();
    }
}
