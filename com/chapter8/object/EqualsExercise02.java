package com.chapter8.object;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person_ p1 = new Person_();
        p1.name = "hsp";
        Person_ p2 = new Person_();
        p2.name = "hsp";
//判断equal的使用结果
        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));
        String s1 = new String("as");
        String s2 = new String("as");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}

class Person_ {
    public String name;
}
