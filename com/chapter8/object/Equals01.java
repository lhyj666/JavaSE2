package com.chapter8.object;


public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);
        B obj = a;
        System.out.println(obj == c);
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num2 == num1);

        "hello".equals("abc");

    }
}

class B {

}

class A extends B {

}