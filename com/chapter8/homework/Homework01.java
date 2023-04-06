package com.chapter8.homework;

public class Homework01 {
    public static void main(String[] args) {

        Person[] person = new Person[3];
        person[0] = new Person("jak", 10, "教练");
        person[1] = new Person("kare", 19, "作家");
        person[2] = new Person("mao", 9, "导师");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }


        Person temp = null;
        //冒泡排序对象,从大到小
        for (int i = 0; i < person.length - 1; i++) {

            if (person[i].getAge() < person[i + 1].getAge()) {
                temp = person[i];
                person[i] = person[i + 1];
                person[i + 1] = temp;
            }
        }

        System.out.println("排序后");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }
    }

}

class Person {
    private String name;
    private int age;
    private String job;


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
    //冒泡排序
        /* //冒泡
        int[] arr = {};
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for( int j = 0; j < arr.length - 1 -i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n==第" + (i + 1) + "轮==");
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + "\t");
            }
        }*/


}
