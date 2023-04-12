package com.chapter8.homework.Homework13;

public class Student extends Person {
    private int stu_id;

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study();//组合编程思想

    }

    public Student(String name, int age, char sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println(super.getName() +
                "我会好好学习");
    }

    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
