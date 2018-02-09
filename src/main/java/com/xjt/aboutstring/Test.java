package com.xjt.aboutstring;

/**
 * Created by Kevin on 2018/1/22.
 */
public class Test {

    public static void main(String[] args) {

        //在Java7以前，常量池和Java堆的空间是物理隔离的，
        // 执行intern方法时，如果常量池不存在该字符串，虚拟机会在常量池中复制该字符串，
        // 并返回引用，所以需要谨慎使用intern方法，避免常量池中字符串过多，结果是false false

        //在Java7之后，常量池已经在Java堆上分配内存，
        // 执行intern方法时，如果常量池已经存在该字符串，
        // 则直接返回字符串引用，否则复制该字符串对象的引用到常量池中并返回，结果是true,false
        //对于变量s1,因为常量池没有good,所以s1.intern() 和 s1都是指向Java对象上的String对象。
        String s1 = new StringBuilder("go")
                .append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja")
                .append("va").toString();
        System.out.println(s2.intern() == s2);
    }

    /*@org.junit.Test
    public void testString(){
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
    }*/
}
