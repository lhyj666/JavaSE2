package com.chapter11.homework;

public class Homework05 {
    public static void main(String[] args) {

        new A().f1();
    }
}
class A{
    private String NAME= "hello";

    public void f1(){
        class B{
            private final String NAME="教育";
            public void show(){

                System.out.println("NAME="+NAME+"外部类NAME="+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}