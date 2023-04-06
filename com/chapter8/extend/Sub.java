package com.chapter8.extend;

public class Sub extends Base {
    public Sub() {//构造器
        super("smith", 19);//默认调用父类无参构造器，可写可不写
        System.out.println("子类构造器sub()被调用...");
    }

    public Sub(String name) {
        System.out.println("子类构造器sub(string name)被调用...");
    }

    public Sub(String name, int age) {
        super(name, age);
        System.out.println("子类构造器sub(string name)被调用...");
    }

    public void sayOk() {//子类
        System.out.println(n1 + " " + n2 + "" + n3);
        test100();
        test200();
        test300();
        //test400()
        System.out.println("n4=" + getN4());
        callTest400();
    }

}
