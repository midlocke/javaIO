package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 *
 * 类的加载机制，父亲委托机制，除了Java自带的根类加载器以外，其余类加载器都只有一个父类加载器
 * 只有当父类加载器都不能加载时，才会由子类加载器进行加载
 * 从系统属性sun.boot.class.path所指定的目录中加载类库
 *
 * 根类加载器是用c++来实现的，它并没有继承java.lang.ClassLoader类
 *
 * 扩展类加载器 父加载器为根类加载器  加载目录jre\lib\ext
 * 如果把用户创建的jar包放在该目录下，则会自动由扩展类加载器进行加载
 * classLoader类的子类
 *
 * 系统类加载器，应用类加载器 父加载器为扩展类加载器
 * 从环境变量classpath或者系统属性java.class.path所指定的目录中加载类，它是用户自定义的类加载器
 * 的默认父加载器，
 * classLoader类的子类
 *
 * 父子加载器并非继承关系，也就是说子加载器不一定是继承了父加载器
 *
 * 用户自己定义的类加载器必须继承classLoader类
 *
 * 父委托机制：安全考虑，每个类都会由确定的层次中一个类加载器进行加载
 *
 * 每个类加载器都有自己的命名空间，命名空间由该加载器及所有父加载器所加载的类组成。
 * 同一个命名空间中，不会出现类的完整名字相同的两个类
 * 不同命名空间中，有可能会出现类的完整名字相同的两个类
 *
 */

/**
 * 若有一个类加载器能成功加载Sample类，那么这个类加载器被称为定义类加载器，
 * 所有能成功返回Class对象的引用的类加载器（包括定义类加载器）都被称为初始类加载器
 *

 */
public class Describe3 {

    //* 加载器之间的父子关系实际上指的是加载器对象之间的包装关系，而不是类之间的继承关系，一堆父子
    //* 加载器可能是同一个加载器类的两个实例，也可能不是。在子加载器对象中包装了一个父加载器对象
    ClassLoader loader1 = new MyClassLoader();

    //参数loader1将作为loader2的父加载器
    ClassLoader loader2 = new MyClassLoader(loader1);

}

//当没有指定父类加载器时，系统默认将System类加载器作为父类加载器
class MyClassLoader extends ClassLoader{

    public MyClassLoader(){

    }

    public MyClassLoader(ClassLoader loader){

    }

}
