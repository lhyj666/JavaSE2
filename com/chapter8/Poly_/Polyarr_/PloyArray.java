package com.chapter8.Poly_.Polyarr_;

public class PloyArray {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 19, 100);
        persons[2] = new Student("smith", 18, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < persons.length; i++) {
            //persons[i]的编译类型person，运行类型是根据实际情况jvm内存判断
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher techer = (Teacher) persons[i];
                techer.teach();

            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("类型有误");
            }

        }
    }
}
