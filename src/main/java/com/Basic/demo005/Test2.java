package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test2 {

    public static void main(String[] args) {

        System.out.println(FinalTest.x);
    }
}

class FinalTest{

    //x在编译的时候就已经确定了，是一个编译时的常量，使用编译好的常量时，是不会导致类的初始化
    public static final int x = 6/3;

    static {
        System.out.println("FinalTest static block");
    }
}
