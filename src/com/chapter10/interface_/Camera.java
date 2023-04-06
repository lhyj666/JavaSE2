package com.chapter10.interface_;

public class Camera implements UsbInterface{
    //实现接口，就是把接口方法实现
    @Override
    public void start() {
        System.out.println("相机开始");
    }

    @Override
    public void stop() {
        System.out.println("相机结束");
    }
}
