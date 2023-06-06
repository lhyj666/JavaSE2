package com.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {

        Collection col = new ArrayList();
        col.add(new Book("三国", "罗贯中", 10.1));
        col.add(new Book("小李", "古董", 5.1));
        col.add(new Book("鼓楼", "赵雷", 34.1));

        for (Object book : col) {
            System.out.println("book=" + book);

        }

    }
}
