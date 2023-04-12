package com.chapter8.homework.Homework13;

public class Teacher extends Person {
    private int work_age;

    public void printInfo() {
        System.out.println("教师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();//组合编程思想

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }

    public Teacher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(super.getName() + "我会呼呼教学");
    }

    public String play(String name) {
        return super.play() + "象棋";
    }
}
