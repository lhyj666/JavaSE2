package com.chapter8.extend.improve;

//父类student，
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名字" + name + age + "成绩" + score);
    }
}
