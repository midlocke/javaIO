package com.example.demo002;

import java.io.File;
import java.io.IOException;

/**
 * Created by lichao on 2017/9/28.
 */
public class FileDemo {

    public static void main(String[] args) {

        createFile();
    }

    private static void createFile(){

        File file = new File("D:\\testfile\\demo01.txt");

        try {
            //当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
            boolean createResult = file.createNewFile();
            if(createResult){
                //返回由此抽象路径名表示的文件或目录的名称。
                System.out.println("该分区大小"+file.getTotalSpace()/(1024*1024*1024)+"G");

                //创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
                boolean dirResult = file.mkdirs();
//            f.delete(); //  删除此抽象路径名表示的文件或目录
                System.out.println("文件名  "+file.getName());  //  返回由此抽象路径名表示的文件或目录的名称。
                // 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
                System.out.println("文件父目录字符串 "+file.getParent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
