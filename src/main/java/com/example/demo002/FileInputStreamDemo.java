package com.example.demo002;

import java.io.*;

/**
 * Created by lichao on 2017/9/28.
 */
public class FileInputStreamDemo {

    /**
     * 一个检测文件长度的小程序，别看这个程序挺长的，忽略try catch块后发现也就那么几行而已。
     */
    public static void main(String[] args) {

        int count=0;  //统计文件字节长度
        InputStream streamReader = null;

        try {
            streamReader = new FileInputStream(new File("D:\\testfile\\demo01.txt"));
            /*1.new File()里面的文件地址也可以写成D:/testfile/fileInput.txt,前一个\是用来对后一个
                进行转换的，FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。 */
            while(streamReader.read()!=-1){
                count++;
            }

            System.out.println("---长度是： "+count+" 字节");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                streamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
