package com.chapter14.map_;



import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {


        Map map =new HashMap();
        map.put("no1","hsp");
        map.put("no2","ppp");
        map.put("no3","zsf");
        map.put("no4",null);
        map.put("no5",null);
        map.put(null,null);
        map.put(null,"zzz");
        map.put(new Object(),"jmsw");

        System.out.println(map.get("no2"));

        System.out.println("map="+map);












    }
}
