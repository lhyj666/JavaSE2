package com.chapter15.generic_;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {


        ArrayList<Dog> arrayList=new ArrayList<Dog>();
        arrayList.add(new Dog("sf",18));
        arrayList.add(new Dog("jkn",18));
        arrayList.add(new Dog("ijk",18));

        for(Dog dog: arrayList){

            System.out.println(dog.getName()+"="+dog.getAge());
        }
    }
}

class Dog{
    private  String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}