package com.chapter10.interface_;

public class Interface01 {
    public static void main(String[] args) {
//创建对象
        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        System.out.println("=====");
        computer.work(camera);//把相机接入计算机
    }
}
