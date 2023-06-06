package com.chapter14.homework_;

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {

        Map m=new HashMap();
        m.put("jack",650);
        m.put("tom",2900);
        m.put("jack",2600);

        System.out.println(m);

        Set KeySet =m.keySet();
        for (Object key : KeySet) {

            m.put(key,(Integer)m.get(key)+100);
        }

        System.out.println(m);

        Set entrySet = m.entrySet();
        Iterator iterator=entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"- "+entry.getValue());
        }

        Collection values=m.values();
        for(Object value: values){
            System.out.println("工资="+value);
        }






    }
}

