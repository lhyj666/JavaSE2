package com.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("ajk");
        list.add("fkn");
        list.add("要和你");
        list.add("女儿");

        //三种遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("--2");
        for (Object o : list) {
            System.out.println("o=" + 0);

        }

        System.out.println("---3");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象" + list.get(i));

        }

    }
}
