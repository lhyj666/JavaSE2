package com.chapter10.Abstract;

abstract public class Template {//抽象模版类


    public abstract void job();//抽象对象

    public void calculateTime(){//实现方法
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间"+(end-start));
    }
}
