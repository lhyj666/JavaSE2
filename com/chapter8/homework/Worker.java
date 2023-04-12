package com.chapter8.homework;

public class Worker extends Employee {
    public Worker(String name, int daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工:");
        super.printSal();
    }
}
