package com.xjt.Strategy;

import com.xjt.Strategy.impl.AttackJY;
import com.xjt.Strategy.impl.DefendTBS;
import com.xjt.Strategy.impl.DisplayJCTQ;

public class Test {
    public static void main(String[] args) {
        Role roleA = new RoleA("A");

        //只需要设置就可以获取功能了
        roleA.setAttackBehavior(new AttackJY())//
                .setDefendBehavior(new DefendTBS())//
                .setDisplayBehavior(new DisplayJCTQ());//
        System.out.println(roleA.name + ":");
        roleA.attack();
        roleA.defend();
        roleA.display();

    }
}
