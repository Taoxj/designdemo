package com.xjt.proxy.cglib;


import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
public class CglibProxyFactory implements MethodInterceptor {

    //维护目标对象
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();

        //设置父类
        enhancer.setSuperclass(target.getClass());

        //设置回调函数
        enhancer.setCallback(this);

        //创建子类(代理对象)
        return enhancer.create();
    }

    //其实也是通过重新注入的方式来实现代理的
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        System.out.println("提交事务...");

        return returnValue;
    }
}
