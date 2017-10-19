package com.example.demomain;

import java.io.*;

/**
 * Created by lichao on 2017/9/30.
 */
public class Demo002Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\testfile\\demo01.txt"));
        File file = new File("E:\\testfile\\demo01.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\testfile\\demo01.txt"));
        int n = 0;
        byte[] bb = new byte[1024];

        while ((n=fileInputStream.read())!=-1){
            fileOutputStream.write(bb,0,n);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
