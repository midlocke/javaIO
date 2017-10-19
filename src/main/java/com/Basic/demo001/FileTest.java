package com.Basic.demo001;

import java.io.File;

/**
 * Created by lichao on 2017/9/30.
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("D:\\testfile\\demo01.txt");

        System.out.println("文件或目录是否存在：" + file.exists());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是目录吗？" + file.isDirectory());
        System.out.println("名称： " + file.getName());
        System.out.println("路径：" + file.getPath());
        System.out.println("绝对路径： " + file.getAbsolutePath());
    }

}
