package com.Basic.demo005;

/**
 * Created by lichao on 2017/10/16.
 *
 * 包可见性：包名相同，定义类加载器相同
 * 如：定义一个java.lang.Spy包，是不能访问核心类库java.lang包中的包可见成员
 *
 * 创建用户自定义的类加载器--覆盖findClass方法，会由loadClass方法调用
 */
public class Describe4 {
}
