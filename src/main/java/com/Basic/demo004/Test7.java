package com.Basic.demo004;

/**
 * Created by lichao on 2017/10/16.
 *
 * Child3.a是父类的静态变量，因此会对Parent3进行初始化，但是不会对Child3进行初始化
 */
public class Test7 {

    public static void main(String[] args) {

        System.out.println(Child3.a);

        Child3.doSomething();

    }
}

class Parent3{

    static int a =3;

    static  {
        System.out.println("Parent3 static block");
    }

    static void doSomething(){
        System.out.println("do Something");
    }
}

class Child3 extends Parent3{

    static  {
        System.out.println("Child3 static block");
    }
}
