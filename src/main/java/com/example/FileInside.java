package com.example;

import java.io.File;
import java.io.IOException;

/**
 * Created by lichao on 2017/9/27.
 */
public class FileInside {

    public static void main(String[] args) {
        //public File(String pathname)
        File file = new File("D:\\file\\filetest.txt");
        System.out.println(file);

        //public File(String parent,String child)
        File file2 = new File("D:\\file","filetest.txt");
        System.out.println(file2);

        //public File(File parent,String child)
        File file3 = new File("D:\\file");
        File file4 = new File(file3,"filetest.txt");
        System.out.println(file4);

        //private File(String child,File file)
        //private File(String pathname,int prefixLength)
        File file5 = new File("file://192.168.240.230/a.txt");
        System.out.println(file5);


        try {
             /*SecurityManager 为安全管理器是一个允许应用程序实现安全策略的类。
             权限分为以下类别：文件、套接字、网络、安全性、运行时、属性、AWT、反射和可序列化*/
            boolean canWrite = file.createNewFile();
            System.out.println(canWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
