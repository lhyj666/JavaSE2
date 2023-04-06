package com.chapter10;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();

        new D().say();
    }
}
class D{
    public void say(){

    }
    public static void hi(){

    }
}