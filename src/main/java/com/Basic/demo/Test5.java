package com.Basic.demo;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test5 {

    //启动类首先加载
    static {
        System.out.println("Test5 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child.b);
    }
}

class Parent {
    static int a = 3;

    static {
        System.out.println("Parent static block");
    }
}

class Child extends Parent {
    static int b = 4;

    static {
        System.out.println("Child static block");
    }
}
