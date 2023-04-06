package com.chapter10.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("outer05的hashcode"+outer05);
    }
}


class Outer05{

    private int n1 = 10;
    public void f1(){
        Person p = new Person(){

            @Override
            public void hi() {
                super.hi();
                System.out.println("匿名内部类重写hi");
                System.out.println("outer05.this的hashcode="+Outer05.this);
            }

            @Override
            public void ok(String str) {
                super.ok(str);
                System.out.println("匿名内部类重写OK");
            }
        };
        p.hi();//通过创建对象接受匿名内部类调用方法

        //也可以不创建对象，直接调用方法
        new Person(){
            @Override
            public void hi() {
                super.hi();
                System.out.println("匿名内部类重写hi");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
                System.out.println("匿名内部类重写OK");
            }
        }.ok("lusy");
    }



}
class Person{
    public void hi(){
        System.out.println("person 的hi");
    }
    public void ok(String str){
        System.out.println("person的OK"+str);
    }
}