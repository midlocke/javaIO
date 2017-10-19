package com.Basic.demo;

/**
 * 类的加载过程
 */
public class Test1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "xiaoming";
        p1.country = "chinese";
        Person p2 = new Person();
        p2.name = "xiaohong";
        p1.speak();
        p2.speak();
    }

}

class Person {
    String name;
    static String country;
    public void speak() {
        System.out.println("name:"+name+",country:"+country);
    }
}
