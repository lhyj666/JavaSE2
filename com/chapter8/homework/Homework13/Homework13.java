package com.chapter8.homework.Homework13;

public class Homework13 {
    public static void main(String[] args) {

/*        Teacher teacher = new Teacher("lusy", 19, '男', 23);
        teacher.printInfo();
        Student student = new Student("kang", 12, '女', 1000000);
        student.printInfo();*/

        Person[] persons = new Person[4];
        //persons对象向上转型，
        persons[0] = new Student("kang", 12, '女', 1000000);
        persons[1] = new Student("dan", 13, '女', 1000000);
        persons[2] = new Teacher("lusy", 219, '男', 23);
        persons[3] = new Teacher("hno", 19, '男', 23);
        System.out.println("排序前");

        Homework13 homework13 = new Homework13();
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);
        }
        //调用Homework13类的方法冒泡排序
        homework13.bubbleSort(persons);
        System.out.println("排序后");

        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);
        }

        System.out.println("=========");
        for (int i = 0; i < persons.length; i++) {

            homework13.test(persons[i]);
        }
    }


    //persons对象向下转型，
    //向下转型+运行类型判断
    public void test(Person person) {
        if (person instanceof Student) {
            Student student = (Student) person;
            student.study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("do");

        }
    }

    public void bubbleSort(Person[] persons) {
        Person tmp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }

        }

    }
}