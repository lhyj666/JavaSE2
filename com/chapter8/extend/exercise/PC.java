package com.chapter8.extend.exercise;

public class PC extends Computer {

    private String brand;

    //这里idea直接工具继承规则，自动把构造器写好
    //父类的构造器完成父类属性初始化
    //子类构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("pc信息==");
        System.out.println(getDetails() + " brand=" + brand);
    }
}
