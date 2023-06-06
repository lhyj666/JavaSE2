package com.chapter14.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("listeddlist="+linkedList);

        linkedList.remove();

        System.out.println("linkedlist="+linkedList);

        linkedList.set(1,999);
        System.out.println("linkedlist="+linkedList);

        Object o=linkedList.get(1);
        System.out.println(o);

        System.out.println("==迭代器");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next="+next);


        }

        for (Object o1   :linkedList) {
            System.out.println("o1"+o1  );


        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));




        }


        System.out.println("linkedList=" + linkedList);
    }
}
