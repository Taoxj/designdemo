package com.xjt.Decorator;

public class Test {
    public static void main(String[] args) {
        //这一步就是定义了基础的父类实现，就是装饰类本来的东西
        Component component = new ConcreteComponent();

        System.out.println("------------------------------");
        component.method();//原来的方法
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);//装饰成A

        System.out.println("------------------------------");
        concreteDecoratorA.method();//原来的方法
        concreteDecoratorA.methodA();//装饰成A以后新增的方法
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);//装饰成B

        System.out.println("------------------------------");
        concreteDecoratorB.method();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);//装饰成A以后再装饰成B
        System.out.println("------------------------------");
        concreteDecoratorB.method();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
    }
}
