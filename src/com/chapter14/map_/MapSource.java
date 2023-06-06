package com.chapter14.map_;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {

        Map map =new HashMap();
        map.put("no1","hsp");
        map.put("no2","zwj");
        map.put(new Car(),new Person());


        Set set=map.entrySet();
        System.out.println(set.getClass());

        for(Object obj: set){
            Map.Entry entry=(Map.Entry) obj;
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }


        Set set1 =map.keySet();





    }
}
class Car{}

class Person{}