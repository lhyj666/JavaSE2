package com.chapter10.Abstract;

public class Abstract01 {
    public static void main(String[] args) {


    }
}
class Animal{
    private String name;
    public Animal (String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("这是一个动物，但是不知道吃什么");
    }
}