package com.xjt.Strategy;
/**
 * 游戏的角色超类
 *
 * 作为一个超类，当比如产生新的角色时，就可以创建一个类继承 这个超类，然后就可以拥有所有的功能了
 * 并且因为需要的行为是封装成接口的，比如IAttackBehavior，这样，每个角色就可以实现自己的功能
 * 并且可以选择性的展现自己的功能
 *
 */

public abstract class Role {

    protected String name;

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IAttackBehavior attackBehavior;

    public Role setDefendBehavior(IDefendBehavior defendBehavior)
    {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior)
    {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior)
    {
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void display()
    {
        displayBehavior.display();
    }

    protected void attack()
    {
        attackBehavior.attack();
    }

    protected void defend()
    {
        defendBehavior.defend();
    }
}
