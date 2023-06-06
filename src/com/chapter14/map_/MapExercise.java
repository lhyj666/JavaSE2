package com.chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap=new HashMap();
        hashMap.put(1,new Emp("jack",20000,1));
        hashMap.put(2,new Emp("tom",10000,2));
        hashMap.put(1,new Emp("milan",120000,3));


        System.out.println("=====");
        Set keyset= hashMap.keySet();

        for(Object key:keyset){

            Emp emp=(Emp)hashMap.get(key);
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
            System.out.println(key+"-"+ hashMap.get(key));

        }

         Set keySet =hashMap.keySet();
        System.out.println("=========");
        for(Object key: keyset){
            Emp emp=(Emp) hashMap.get(key);
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
        }

        Set entrySet=hashMap.entrySet();
        Iterator  iterator=entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println("--"+entry.getClass());
            Emp emp=(Emp)entry.getValue();
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
        }






    }
}



class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}