//package com.chapter15.improve_;
//
//import java.util.ArrayList;
//
//public class Generic01 {
//    public static void main(String[] args) {
//
//        ArrayList arrayList=new  ArrayList();
//        arrayList.add(new Dog("sf",18));
//        arrayList.add(new Dog("jkn",18));
//        arrayList.add(new Dog("ijk",18));
//
//        for(Object o: arrayList){
//            Dog dog=(Dog) o;
//            System.out.println(dog.getName()+"="+dog.getAge());
//        }
//    }
//}
//
//class Dog{
//    private  String name;
//    private int age;
//
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}