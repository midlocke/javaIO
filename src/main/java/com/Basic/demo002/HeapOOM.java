package com.Basic.demo002;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichao on 2017/10/12.
 */
public class HeapOOM {

    public static void main(String[] args) {
        long arr[];
        for (int i=1; i<=10000000; i*=2) {
            arr = new long[i];
        }
    }
}
