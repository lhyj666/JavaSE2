package com.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {

        Map map =new HashMap();
        map.put("dengchao",new Book("",100));
        map.put("dengchao","shunli");
        map.put("wbq","marong");
        map.put("shunji","marong");
        map.put("lyf",null);
        map.put(null,"lyf");
        map.put("lunhan","gxt");

        System.out.println("map="+map);

         map.remove(null);

         Object val=map.get("lunhan");
        System.out.println("val="+val);

        System.out.println("k-v="+map.size());
        System.out.println(map.isEmpty());

        map.clear();

        System.out.println("map="+map);

        System.out.println(map.containsKey("hsp"));








    }
}
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
