package com.chapter14.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {

        Set set=new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("jack");
        set.add(null);
        set.add("hsp");
        set.add(null);
        set.add("jack");
        System.out.println(set);
        for (int i = 0; i < 10; i++) {
            System.out.println("set="+set);

        }

        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            Object   obj =  iterator.next();
            System.out.println("obj="+obj);
            
        }

        set.remove(null);

        System.out.println("增强==");
        for (Object o :set  ) {
            System.out.println("o="+o);

        }




    }
}
