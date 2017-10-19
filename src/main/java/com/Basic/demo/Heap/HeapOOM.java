package com.Basic.demo.Heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichao on 2017/10/18.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {

        List<OOMObject> list = new ArrayList<>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
