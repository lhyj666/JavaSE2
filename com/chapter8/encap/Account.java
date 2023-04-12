package com.chapter8.encap;

public class Account {
    //封装
    private String name;
    private double balance;
    private String pwd;

    public Account() {

    }

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求2-4位，默认值 无名");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须>20,默认0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为六位，默认000000");
            this.pwd = "000000";
        }
    }

    //显示账号
    public void showInfo() {
        System.out.println("账户信息 name=" + name + "余额" + balance + "密码" + pwd);
    }

}
