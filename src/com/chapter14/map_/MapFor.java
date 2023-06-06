package com.chapter14.map_;

import java.rmi.MarshalledObject;
import java.util.*;

public class MapFor {
    public static void main(String[] args) {

        Map map =new HashMap();
        map.put("dengchao",new Book("",100));
        map.put("dengchao","shunli");
        map.put("wbq","marong");
        map.put("shunji","marong");
        map.put("lyf",null);
        map.put(null,"lyf");
        map.put("lunhan","gxt");

        Set keyset =map.keySet();//取出key
        for (Object key : keyset){
            System.out.println(key+ "-"+map.get(key));
        }

        System.out.println("=======");
        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()){
            Object key=iterator.next();
            System.out.println(key+ "-"+map.get(key));

        }


        Collection values = map.values();//取出value
        for(Object value: values){

            System.out.println(value);
        }

        System.out.println("==========");
        Iterator iterator2=values.iterator();//
        while (iterator2.hasNext()){
            Object value= iterator2.next();
            System.out.println(value);
        }


        System.out.println("=========");
        Set entrySet=map.entrySet();//获取k-v
        System.out.println(entrySet.getClass());
        for(Object entry : entrySet){

            Map.Entry m=(Map.Entry) entry;

            System.out.println(m.getKey()+"--"+m.getValue());
        }


        System.out.println("------");
        Iterator iterator3=entrySet.iterator();
        System.out.println(entrySet.getClass());
        while (iterator3.hasNext()){
            Object entry=iterator3.next();

            Map.Entry m=(Map.Entry)entry;


            System.out.println(m.getKey()+"-"+m.getValue());
        }














    }
}
