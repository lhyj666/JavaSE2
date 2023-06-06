package com.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张珊");
        list.add("历史");
        list.add("阿飞");
        System.out.println("list=" + list);

        List list2 = new ArrayList();
        list2.add("方法");
        list2.add("司法局");
        list.addAll(1, list2);
        System.out.println("list=" + list);

        System.out.println(list.indexOf("tom"));

        list.add("阿飞");
        System.out.println(list.lastIndexOf("阿飞"));
        list.remove(0);
        System.out.println("list=" + list);

        list.set(1, "模块");
        System.out.println("list=" + list);

        List returnlist = list.subList(0, 2);
        System.out.println("returnlist=" + returnlist);

    }
}
