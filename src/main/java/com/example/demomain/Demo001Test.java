package com.example.demomain;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lichao on 2017/9/28.
 */
public class Demo001Test {

    /**
     * 拿到文件，并将文件中的内容读取出来
     * @param args
     */
    public static void main(String[] args) throws IOException {

        readFromFile();
        writeToFile();
        readFromFile();

    }

    /**
     * 读取文件
     * @throws IOException
     */
    private static void readFromFile()throws IOException{
        File file = new File("D:\\testfile\\demo01.txt");// 指定要读取的文件

        FileReader reader = new FileReader(file);// 获取该文件的输入流

        char[] bb = new char[1024];// 用来保存每次读取到的字符
        String str = "";// 用来将每次读取到的字符拼接，当然使用StringBuffer类更好
        int n ;// 每次读取到的字符长度
        while ((n=reader.read(bb)) != -1){
            str += new String(bb,0,n);
        }

        reader.close();
        System.out.println(str);
     }

    /**
     * 写入文件
     */
    private static void writeToFile()throws IOException{
        String writerContent = "hello world,你好世界";// 要写入的文本

        File file = new File("D:\\testfile\\demo01.txt");// 要写入的文本文件

        if(!file.exists()){// 如果文件不存在，则创建该文件
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);// 获取该文件的输出流
        writer.write(writerContent);// 写内容
        writer.flush();// 清空缓冲区，立即将输出流里的内容写到文件里
        writer.close();// 关闭输出流，施放资源
    }
}
