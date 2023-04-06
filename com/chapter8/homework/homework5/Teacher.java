package com.chapter8.homework.homework5;

public class Teacher extends Employee {
    private int classDays;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("教师 ");
        System.out.println(getName() + "年工资:"
                + (getSal() * getSalMonth() + getClassSal() * getClassDays()));
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
