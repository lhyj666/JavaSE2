package com.chapter8.homework;

public class Homework07 {

}

class Test {
    String name = "rose";

    Test() {
        System.out.println("test");//（1）
    }

    Test(String name) {
        this.name = name;//此处this指的当前类
    }

}

class Demo extends Test {
    String name = "jack";

    Demo() {
        super();
        System.out.println("Demo");//（2）
    }

    Demo(String s) {
        super(s);
    }

    public void test() {
        System.out.println(super.name);//（3）………rose（5）join
        System.out.println(this.name);//（4）…………jack（6）jack
    }

    //匿名对象
    public static void main(String[] args) {
        new Demo().test();
        new Demo("join").test();//属性没有动态绑定机制
    }

}