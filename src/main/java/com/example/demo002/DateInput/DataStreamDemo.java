package com.example.demo002.DateInput;

import java.io.*;

/**
 * Created by lichao on 2017/9/28.
 */
public class DataStreamDemo {

    public static void main(String[] args) throws IOException {
        Member[] members = {new Member("Justin",90),
                new Member("momor",95),
                new Member("Bush",88)};

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File("D:\\testfile\\demo01.txt")));
            for(Member member:members)
            {
                //写入UTF字符串
                dataOutputStream.writeUTF(member.getName());
                //写入int数据
                dataOutputStream.writeInt(member.getAge());
            }

            //所有数据至目的地
            dataOutputStream.flush();
            //关闭流
            dataOutputStream.close();

            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File("D:\\testfile\\demo01.txt")));
            //读出数据并还原为对象
            for(int i=0;i<members.length;i++)
            {
                //读出UTF字符串
                String name =dataInputStream.readUTF();
                //读出int数据
                int score =dataInputStream.readInt();
                members[i] = new Member(name,score);
            }

            //关闭流
            dataInputStream.close();

            //显示还原后的数据
            for(Member member : members)
            {
                System.out.printf("%s\t%d%n",member.getName(),member.getAge());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
