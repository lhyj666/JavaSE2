package com.chapter8.extend;

public class ExtendsDetail {
    public static void main(String[] args) {
//        System.out.println("==第一个对象==");
//        Sub sub = new Sub();
//        System.out.println("==第二个对象==");
//        Sub sub2 = new Sub("jack");

        System.out.println("==第三个对象==");
        Sub sub3 = new Sub("king", 10);
        System.out.println(sub3.name + " " + sub3.age);

//        sub.sayOk();
    }
}
