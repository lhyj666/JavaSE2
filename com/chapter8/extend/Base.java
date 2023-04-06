package com.chapter8.extend;

//父类
public class Base extends TopBase {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public String name;
    public int age;

    public Base() {//构造器
        System.out.println("父类Base()被调用...");
    }

    public Base(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("父类Base(String name, int age)构造器被调用。。");
    }

    public Base(String name) {
        System.out.println("父类Base(String name)构造器被调用");
    }

    //父类通过一个public方法
    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    public void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void callTest400() {
        test400();
    }
}
