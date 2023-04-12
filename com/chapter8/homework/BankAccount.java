package com.chapter8.homework;

public class BankAccount {
    private double banlance;//余额

    public BankAccount(double initialBalance) {
        this.banlance = initialBalance;
    }

    //存款
    public void deposit(double amount) {
        banlance += amount;
    }

    //取款
    public void withdraw(double amount) {
        banlance -= amount;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
}
