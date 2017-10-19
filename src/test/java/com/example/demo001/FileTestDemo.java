package com.example.demo001;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by lichao on 2017/9/27.
 */
public class FileTestDemo {

    //创建，删除
    @Test
    public void test001(){
        File f = new File("D:\\1.txt");
        try {
            System.out.println(f.createNewFile());
            System.out.println(f.delete());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //列出磁盘上的文件
    @Test
    public void test002(){
        File[] files =File.listRoots();
        for(File file:files){
            System.out.println(file);
            if(file.length()>0){
                String[] filenames =file.list();
                for(String filename:filenames){
                    System.out.println(filename);
                }
            }
        }
    }

    //文件过滤
    @Test
    public void test003(){
        File[] files =File.listRoots();
        for(File file:files){
            System.out.println(file);
            if(file.length()>0){
                String[] filenames =file.list(new FilenameFilter(){
                    //file 过滤目录 name 文件名
                    public boolean accept(File file,String filename){
                        return filename.endsWith(".mp3");
                    }
                });
                for(String filename:filenames){
                    System.out.println(filename);
                }
            }
        }
    }

    //利用递归，列出所有文件
    @Test
    public void test004(){
        File f =new File("d:\\program");
        showDir(f);
    }

    public static void showDir(File dir){
        System.out.println(dir);
        File[] files =dir.listFiles();
        for(File file:files){
            if(file.isDirectory())
                showDir(file);
            else
                System.out.println(file);
        }
    }

    //移动文件
    @Test
    public void test005(){
        File f1 = new File("d:\\testfile");
        moveFile(f1);
    }

    public static void moveFile(File dir){
        File[] files=dir.listFiles();
        for(File file:files){
            if(file.isDirectory())
                moveFile(file);
            else{
                if(file.getName().endsWith(".java"))
                    file.renameTo(new File("c:\\jad\\"+
                            file.getName().substring(0,file.getName().lastIndexOf('.'))+".jad"));
            }
        }
    }
}
