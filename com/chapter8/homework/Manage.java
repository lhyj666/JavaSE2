package com.chapter8.homework;

public class Manage extends Employee {
    private double bonnus;

    public Manage(String name, int daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {

        System.out.println("经理:" + getName() + "->工资=" + (getBonnus() + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonnus() {
        return bonnus;
    }

    public void setBonnus(double bonnus) {
        this.bonnus = bonnus;
    }
}
