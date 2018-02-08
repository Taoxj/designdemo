package com.xjt.Adapter;

public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        //这里就是把v5Power这个对象通过适配器来实例化了
        mobile.inputPower(v5Power);
    }
}
