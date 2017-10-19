package com.Basic.demo;

/**
 * Created by lichao on 2017/10/17.
 */
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {

        //如果一个类是根类加载器进行加载的话，这个类加载器就会返回空
        Class clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        //自定义的类不会由bootstrap类加载器进行加载
        Class clazz2 = Class.forName("com.Basic.demo.Test2C");
        System.out.println(clazz2.getClassLoader());
    }
}

class Test2C{

}
