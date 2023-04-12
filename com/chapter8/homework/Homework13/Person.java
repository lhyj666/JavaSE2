package com.chapter8.homework.Homework13;

public class Person {
    private String name;
    private int age;
    private char sex;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String basicInfo() {
        return "姓名\t" + this.name + "\n"
                + "年龄\t" + this.age + "\n"
                + "性别\t" + this.sex;
    }

    public String play() {
        return this.getName() + "爱玩";
    }

    public String play(String name) {
        return this.name;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getsex() {
        return sex;
    }

    public void setsex(char sex) {
        this.sex = sex;
    }
}
