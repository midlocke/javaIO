package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {

        //如果一个类是根类加载器进行加载的话，这个类加载器就会返回空
        //Java中所有的基本数据类型都是由根加载器加载的！（JDK1.5以后将void纳入为基本数据类型）！
        //JDK提供的类都是由根类加载器进行加载
        Class clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        //自定义的类不会由bootstrap类加载器进行加载
        Class clazz2 = Class.forName("com.Basic.demo005.c");
        System.out.println(clazz2.getClassLoader());
    }
}

class c{}

class Sample1{
    static int a = 1;
    static {
        a = 2;
    }
    static {
        a = 4;
    }
}
