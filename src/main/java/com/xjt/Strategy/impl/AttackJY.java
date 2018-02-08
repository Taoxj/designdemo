package com.xjt.Strategy.impl;

import com.xjt.Strategy.IAttackBehavior;

/**
 * 根据需求来创建类实现接口的方法
 */
public class AttackJY implements IAttackBehavior {

    public void attack() {
        System.out.println("九阳神功！");
    }
}
