package com.chapter8.homework;

public class Homework08 {
    public static void main(String[] args) {

       /* CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);

        checkingAccount.withdraw(100);
        System.out.println(checkingAccount.getBanlance());*/

        //测试savingAccount
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);

        System.out.println(savingAccount.getBanlance());
        savingAccount.deposit(100);

        //月初自动调用定时器方法earnmonth,乘以利率
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBanlance());
        savingAccount.withdraw(100);//免手续费
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBanlance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getCount());
    }
}
