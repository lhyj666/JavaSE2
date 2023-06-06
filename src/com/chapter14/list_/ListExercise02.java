package com.chapter14.list_;


import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new com.chapter14.list_.Book("三国", "贯中", 10.1));
        list.add(new com.chapter14.list_.Book("小李", "古董", 52.1));
        list.add(new com.chapter14.list_.Book("鼓楼", "赵雷", 34.1));

        //遍历

        System.out.println("==排序前");
        for (Object o : list) {
            System.out.println(o);

        }

        //冒泡
        sort(list);

        System.out.println("==排序后");
        for (Object o : list) {
            System.out.println(o);

        }


    }

    //冒泡
    public static void sort(List list) {

        int listSize = list.size();
        System.out.println(listSize);
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
