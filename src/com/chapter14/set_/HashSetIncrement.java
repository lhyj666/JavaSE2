package com.chapter14.set_;



import java.util.HashSet;

public class HashSetIncrement {
    public static void main(String[] args) {

        HashSet hashSet =new HashSet();
//        for (int i = 1; i <=100; i++) {
//            hashSet.add(i);

        for (int i = 1; i <=12; i++) {
            hashSet.add(new A(i));

        }


    }
}
class A {
    private int name;

    public A(int name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}