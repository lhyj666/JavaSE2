package com.mlm.chapter8.extend;

public class AccountTest {
    public static void main(String[] args) {
        //封装
        //非构造器赋值，用set()+get()
        Person person = new Person();
        person.setName("韩顺平");
        person.setAge(300);
        person.setSalary(90000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        //使用构造器指定赋值
        Person smith = new Person("smith", 2000, 30000);
        System.out.println("=====smith的信息===");
        System.out.println(smith.info());
    }


}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {// 无参构造器
    }

    public Person(String name, int age, double salary) {
   /*     this.name = name;
        this.age = age;
        this.salary = salary;*/
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度格式不对，要（2-6）个字符，默认名");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }


    public double getSalary() {//输出

        return salary;
    }

    public void setSalary(double salary) {//输入
        this.salary = salary;
    }

    public String info() {
        return "信息" + "\nname=" + name + "\n" + "age=" + +age + "\n" + "salary=" + salary;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在 1-120");
            this.age = 10;
        }
    }
}