package com.chapter8.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getAge());
        System.out.println(son.name);
    }
}

class GrandPa {
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Son extends Father {
    String name = "儿子";


}