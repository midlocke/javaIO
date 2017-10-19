package com.example.demo002;

import java.io.*;

/**
 * Created by lichao on 2017/9/28.
 */
public class ObjectStream {

    public static void main(String[] args) {
        ObjectOutputStream objectwriter = null;
        ObjectInputStream objectreader = null;


        try {
            objectwriter = new ObjectOutputStream(new FileOutputStream("D:/testfile/demo01.txt"));
            objectwriter.writeObject(new Student("gg", 22));
            objectwriter.writeObject(new Student("tt", 18));
            objectwriter.writeObject(new Student("rr", 17));
            objectreader = new ObjectInputStream(new FileInputStream("D:/testfile/demo01.txt"));
            for (int i = 0; i < 3; i++) {
                System.out.println(objectreader.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                objectreader.close();
                objectwriter.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }

        }
    }
}

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
