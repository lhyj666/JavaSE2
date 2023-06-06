package com.chapter14.map_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource02 {
    public static void main(String[] args) {

        HashMap hashMap=new HashMap();
        for(int i=1;i<=12; i++){
            hashMap.put(new A(i),"hello");
        }
        System.out.println("hashMap="+hashMap);
    }
}
class A{
    private int num;

    public A(int num) {
        this.num = num;
    }



    @Override
    public int hashCode() {
        return 100;
    }
}