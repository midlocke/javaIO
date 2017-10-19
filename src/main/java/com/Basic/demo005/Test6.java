package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 * 程序中对子类的“主动使用”会导致父类被初始化，但对父类的主动使用不会导致所有子类被初始化
 *
 * 只有当程序访问的静态变量或静态方法确实在当前类或当前接口中定义时，才可以认为是对该类的主动使用
 *
 *
 */
public class Test6 {

    static {
        System.out.println("Test static block");
    }

    public static void main(String[] args) {

        Parent2 parent;

        System.out.println("*************************");

        parent = new Parent2();

        System.out.println(Parent2.a);

        System.out.println(Child2.b);
    }
}

class Parent2{
    static int a = 3;

    static {
        System.out.println("parent2 static block");
    }
}

class Child2 {
    static int b = 4;
    static {
        System.out.println("child2 static block");
    }
}
