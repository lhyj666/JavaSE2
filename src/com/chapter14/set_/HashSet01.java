package com.chapter14.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet set= new HashSet();

        System.out.println(set.add("johh"));
        System.out.println(set.add("kool"));
        System.out.println(set.add("kool"));

        System.out.println(set.add("fppp"));
        System.out.println(set.add("ijjil"));


        set.remove("johh");
        System.out.println("set+"+set);

        set= new HashSet();

        System.out.println("set="+set);

        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("roo"));
        set.add(new Dog("roo"));
        System.out.println("set="+set );

        set.add(new String("hsp"));
        set.add(new String("hsp"));
        System.out.println("set="+set);











    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}