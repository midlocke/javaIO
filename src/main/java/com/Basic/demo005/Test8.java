package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test8 {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        System.out.println(classLoader);

        //根类加载器为null
        while (null != classLoader){

            classLoader = classLoader.getParent();

            System.out.println(classLoader);
        }
    }
}


