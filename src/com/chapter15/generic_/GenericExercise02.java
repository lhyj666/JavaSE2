package com.chapter15.generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,11)));
        employees.add(new Employee("kom",2000,new MyDate(2001,1,1)));
        employees.add(new Employee("tom",1000,new MyDate(2000,1,1)));
        System.out.println("employee="+employees);

        System.out.println("==员工排序");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
    /*

                int yearMinus=o1.getBirthday().getYear()-o2.getBirthday().getYear();
                if(yearMinus != 0){
                    return yearMinus;
                }

                int monthMinus=o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                if(monthMinus!= 0){
                    return monthMinus;
                }

                return o1.getBirthday().getDay()-o2.getBirthday().getDay();
*/

                return  o1.getBirthday().compareTo(o2.getBirthday());

            }


        });
        System.out.println("排序后===");

        System.out.println(employees);






    }
}