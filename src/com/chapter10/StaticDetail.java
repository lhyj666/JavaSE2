package com.chapter10;

public class StaticDetail {
    public static void main(String[] args) {

        B b =new B();
        System.out.println(b.n1);

        System.out.println(C.address);
    }

}
class B{
    public int n1 = 1000;
    public static int n2= 200;

}
class C{
    public static String address= "北京";
}