package com.chapter8.homework;

public class Employee {
    private String name;
    private int daySal;
    private int workDays;
    private double grade;

    //打印工资方法
    public void printSal() {
        System.out.println(name + "->工资=" + daySal * workDays * grade);
    }

    public Employee(String name, int daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaySal() {
        return daySal;
    }

    public void setDaySal(int daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
