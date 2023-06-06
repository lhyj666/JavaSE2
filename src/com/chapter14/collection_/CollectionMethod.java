package com.chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add(19);
        list.add(true);
        System.out.println(list);

        list.remove(true);
        System.out.println(list);

        System.out.println(list.contains("jack"));
        System.out.println(list.isEmpty());

        ArrayList list2 = new ArrayList();
        list2.add("红楼");
        list2.add("水浒");
        list2.addAll(list2);
        System.out.println(list);
        System.out.println(list.contains(list2));

        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list=" + list);
    }
}
