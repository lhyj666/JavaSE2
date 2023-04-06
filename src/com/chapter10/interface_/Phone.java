package com.chapter10.interface_;
//Phone类实现UsbInterface
//即Phone类需要实现接口规定的方法
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始");
    }

    @Override
    public void stop() {
        System.out.println("手机结束");
    }
}
