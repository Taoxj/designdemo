package com.xjt.Decorator;

/**
 * 便是我们的一个具体的接口实现类，也就是俗称的原始对象，或者说待装饰对象。
 */
public class ConcreteComponent implements Component{

    public void method() {
        System.out.println("原来的方法");
    }
}
