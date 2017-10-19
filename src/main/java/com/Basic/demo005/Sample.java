package com.Basic.demo005;

import com.Basic.demo005.Dog;

/**
 * Created by lichao on 2017/10/16.
 */
public class Sample {

    public int v1 = 1;

    public Sample(){

        System.out.println("Sample is loaded by :" + this.getClass().getClassLoader());

        new Dog();
    }
}
