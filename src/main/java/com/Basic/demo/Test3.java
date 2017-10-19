package com.Basic.demo;

import java.util.Random;

/**
 * Created by lichao on 2017/10/16.
 */
public class Test3 {

    public static void main(String[] args) {
        
        System.out.println(FinalTest3.x);
    }
}

class FinalTest3{
    public static final int x = new Random().nextInt(100);

    static {
        System.out.println("FinalTest2 static block");
    }
}
