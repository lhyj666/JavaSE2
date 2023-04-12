package com.chapter8.object;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');

        System.out.println(person1.equals(person2));
        "hs".equals("hs");

    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public boolean equals(Object obj) {
        if (this == obj) {//判断对象地址是否一致
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            //判断对象属性值，是否都一致，是则返回真
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
