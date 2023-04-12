package com.chapter8.Super;

public class B extends A {

    public int n1 = 888;

    public void test() {
        System.out.println("super.n1=" + super.n1);
    }

    public void hi() {
//        System.out.println(super.n1+ " " + super.n2 + " " + super.n3);

    }

    public void sum() {
        System.out.println("B类的一个sum方法");
        //调用父类cal（）方法
        //
        this.cal();
        //
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();

    }

    public B() {
        super();
//        super("jack");
//        super("jack", 10);
    }
}
