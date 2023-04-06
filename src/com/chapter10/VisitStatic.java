package com.chapter10;

public class VisitStatic  {
    public static void main(String[] args) {
//类变量
        System.out.println(A.name);
        A a =new A();
        System.out.println("a.name"+a.name);


    }
}

class A{
    public static String name = "韩顺平";


}