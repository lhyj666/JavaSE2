package com.chapter14.map_;

import com.chapter14.set_.TreeSet_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {

//        TreeMap treeMap =new TreeMap();
        TreeMap treeMap =new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2) .compareTo((String) o2);
            }
        });

        treeMap.put("asjs","jjs");
        treeMap.put("k111aa11","jaf");
        treeMap.put("omm11","aaa");
        treeMap.put("jzz1111","aff");

        System.out.println("treeMap="+treeMap);
    }
}
