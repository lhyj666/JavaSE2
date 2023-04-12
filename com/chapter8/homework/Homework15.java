package com.chapter8.homework;

public class Homework15 {
    public static void main(String[] args) {

        AAA obj = new BB();//向上转型
        System.out.println("obj运行类型=" + obj.getClass());

        obj = new cc();//向上转型
        System.out.println("obj运行类型=" + obj.getClass());

        obj = new BB();
        System.out.println("obj运行类型=" + obj.getClass());

    }
}

class AAA {

}

class BB extends AAA {

}

class cc extends BB {

}
