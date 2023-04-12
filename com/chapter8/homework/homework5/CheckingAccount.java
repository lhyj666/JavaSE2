package com.chapter8.homework.homework5;


import com.chapter8.homework.BankAccount;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);//手续费
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount - 1);
    }
}
