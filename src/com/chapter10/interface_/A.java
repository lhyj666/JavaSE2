package com.chapter10.interface_;

public class A implements AInterface {

    @Override
    public void hi() {
        System.out.println("hi()");
    }

    @Override
    public void ok() {
        AInterface.super.ok();
    }
}
