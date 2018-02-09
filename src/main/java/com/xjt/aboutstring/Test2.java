package com.xjt.aboutstring;

/**
 * Created by Kevin on 2018/1/22.
 */
public class Test2 {

    public static void main(String[] args) {
        //字符串的+操作其本质是创建了StringBuilder对象进行append操作，
        //然后将拼接后的StringBuilder对象用toString方法处理成String对象
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }
}
