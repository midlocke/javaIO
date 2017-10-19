package com.Basic.demo005;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by lichao on 2017/10/16.
 */
public class MyClassLoader2 extends ClassLoader {

    private String name;//类加载器的名字

    private String path = "d:\\";//加载类的路径

    private final String fileType = ".class";//class文件的扩展名

    public MyClassLoader2(String name){

        super();//让系统类加载器成为该类加载器的父加载器

        this.name = name;
    }

    public MyClassLoader2(ClassLoader parent , String name){

        super(parent);//显式指定该类加载器的父加载器

        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class findClass(String name) throws ClassNotFoundException{

        byte[] data = this.loadClassData(name);

        return this.defineClass(name,data,0,data.length);
    }

    private byte[] loadClassData(String name){

        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            //com.Basic.Test.class需要转换为com\Basic\Test.class
            this.name = this.name.replace(".","\\");

            is = new FileInputStream(new File(path + name + fileType));

            baos = new ByteArrayOutputStream();

            int ch = 0;

            while (-1 != (ch = is.read())){

                baos.write(ch);
            }

            data = baos.toByteArray();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
                baos.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        return data;
    }

    public static void main(String[] args) throws Exception {
        //标明loader1的父类加载器为系统类加载器
        //当Sample和Dog都在syslib中会如何？？？
        //classpath是.  当修改classpath后又会如何?
        //MyClassLoader2 loader1 = new MyClassLoader2("loader1");
        //loader1.setPath("d:\\myapp\\serverlib\\");
        //
        ////两个实例构成父子类加载器,在clientlib中是没有东西的，
        ////然而这个类加载器是有父类加载器的，因此先会去找父类加载器让它进行加载
        //MyClassLoader2 loader2 = new MyClassLoader2(loader1,"loader2");
        //loader2.setPath("d:\\myapp\\clientlib\\");
        //
        ////使根类加载器成为该类加载器的父类加载器
        //MyClassLoader2 loader3 = new MyClassLoader2(null,"loader3");
        //loader3.setPath("d:\\myapp\\otherlib\\");
        //
        //test(loader2);
        //test(loader3);

        MyClassLoader2 loader1 = new MyClassLoader2("loader1");
        loader1.setPath("d:\\myapp\\serverlib\\");

        //两个实例构成父子类加载器,在clientlib中是没有东西的，
        //然而这个类加载器是有父类加载器的，因此先会去找父类加载器让它进行加载
        MyClassLoader2 loader2 = new MyClassLoader2(loader1,"loader2");
        loader2.setPath("d:\\myapp\\clientlib\\");

        Class clazz = loader1.loadClass("Sample");
        Object object = clazz.newInstance();//创建一个Sample类的对象

        Sample sample = (Sample)object;

        System.out.println(sample.v1);
    }

    public static void test(ClassLoader loader) throws Exception{

        Class clazz = loader.loadClass("Sample");

        Object object = clazz.newInstance();
    }
}

//cmd  d\myapp\syslib>java MyClassLoader2

//d\myapp\syslib>java -cp .;d\myapp\serverlib MyClassLoader2

//根类加载器：核心类库
//扩展类：jre\lib\ext
//系统类：环境变量中加载

//删除serverlib下的dog.class  放在syslib中
//再运行MyClassLoader
