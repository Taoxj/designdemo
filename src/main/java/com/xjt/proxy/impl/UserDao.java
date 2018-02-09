package com.xjt.proxy.impl;


import com.xjt.proxy.IUserDao;

/**
 * Created by Kevin on 2018/1/22.
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
