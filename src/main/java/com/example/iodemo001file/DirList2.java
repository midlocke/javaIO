package com.example.iodemo001file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by lichao on 2017/9/27.
 */
public class DirList2 {

    //匿名内部类使用的外部变量必须都是final类型的才能使用，
    //在java中，编译器会把匿名内部类使用的外部变量copy一份value值到内部类中使用，
    //为防止内外不统一，编译器就干脆不让匿名内部类使用的外部变量发生改变了，所以都需要定义为final类
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern  = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length == 0){
            list = path.list();
        }else {
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
