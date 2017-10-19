package com.Basic.demo001;

import java.io.*;

/**
 * 文件的复制粘贴
 * Created by lichao on 2017/9/30.
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {

        Object obj = new Object();
        File file = new File("D:/testfile/demo01.txt");

        //创建文件输入流
        FileInputStream fis = new FileInputStream(file);

        File file1 = new File("E:/testfile/demo01.txt");

        if(!file1.exists()){
            file1.createNewFile();
        }

        //创建文件输出流
        FileOutputStream fos = new FileOutputStream(file1);

        byte[] bytes = new byte[1024];//1kb

        int temp = 0;
        while ((temp=fis.read(bytes)) != -1){
            fos.write(bytes,0,temp);
        }

        fos.flush();
        fis.close();
        fos.close();
    }
}
