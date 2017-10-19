package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 */
public class Describe2 {

    //类的初始化步骤：
    //(1) 假如这个类还没有加载和连接，则先进行加载和连接
    //(2) 假如类存在直接的父类，并且这个父类还没有被初始化，则先初始化直接父类
    //(3) 加入类中存在初始化语句，那就依次执行这些初始化语句

    //除了六种主动使用，其他方式都是被动使用，不会导致类的初始化

    //在初始化一个类时，并不会先初始化它所实现的接口；
    //初始化一个接口时，并不会先初始化它的父接口

    //只有当程序首次使用特定接口的静态变量时，才会导致该接口的初始化

    //调用ClassLoader的loadClass方法加载一个类，并不是对类的主动使用，并不会导致类的初始化

}


