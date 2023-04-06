package com.chapter10.main_;

import java.util.SplittableRandom;

public class Main01 {
    private  static String name= "hsp";
    private int n1=100;
    public static void Hi(){

    }

    public void cry(){

    }
    public static void main(String[] args) {

//        System.out.println(n1);错误访问
//        cry();错误
        Hi();
        System.out.println(name);
        new Main01().cry();
    }
}
