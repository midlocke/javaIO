package com.Basic.demo;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test7 {

    public static void main(String[] args) throws ClassNotFoundException {

        //获得系统类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("com.Basic.demo.CL");

        System.out.println("******************");

        clazz = Class.forName("com.Basic.demo.CL");
    }
}

class CL{
    static {
        System.out.println("Class CL");
    }
}
