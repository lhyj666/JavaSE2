package com.chapter15.generic_;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet();
        students.add(new Student("jack",18));
        students.add(new Student("tom",28));
        students.add(new Student("mary",30));

        for(Student student :students){
            System.out.println(student);

        }

        HashMap<String, Student> hm = new HashMap();
        hm.put("mil",new Student("hsp",22));
        hm.put("ml",new Student("hp",22));
        hm.put("rrrl",new Student("hrp",22));

        Set<Map.Entry<String, Student>> entries = hm.entrySet();

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();



    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}