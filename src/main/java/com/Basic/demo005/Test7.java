package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 *
 * 调用loadClass方法加载一个类，并不是对类的主动使用，并不会初始化该类
 */
public class Test7 {

    public static void main(String[] args) throws ClassNotFoundException {

        //获得系统类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("com.Basic.demo005.CL");

        System.out.println("******************");

        clazz = Class.forName("com.Basic.demo005.CL");
    }
}

class CL{
    static {
        System.out.println("Class CL");
    }
}
