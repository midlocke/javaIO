package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 */
public class Dog {

    public Dog(){

        System.out.println("Dog is loaded by :" + this.getClass().getClassLoader());
    }
}
