package com.example.demo002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lichao on 2017/9/28.
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) {

        byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小
        int numberRead=0;
        FileInputStream input=null;
        FileOutputStream out =null;

        try {
            input=new FileInputStream("D:/testfile/demo01.txt");
            out=new FileOutputStream("D:/testfile/demo01.txt"); //如果文件不存在会自动创建

            //numberRead的目的在于防止最后一次读取的字节小于buffer长度，
            while ((numberRead=input.read(buffer))!=-1) {
                out.write(buffer, 0, numberRead); //否则会自动被填充0
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }

        }
    }
}
