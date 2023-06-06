package com.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("jac");
        list.add("tom");
        list.add("mat");
        list.add("hsp");
        list.add("sfoj");
        System.out.println("list=" + list);
        System.out.println(list.get(3));


    }
}
