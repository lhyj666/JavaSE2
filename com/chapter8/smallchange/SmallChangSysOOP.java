package com.chapter8.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//面向过程--------->面向过程、、、、转换
//opp--->oop
public class SmallChangSysOOP {
    //完成零钱通功能
    //将各个功能，对应一个功能方法，
    //定义变量
    //体现了封装的思想，面向对象
//面向过程--------->面向过程
    //把面向过程中的各个变量，转化成为类的属性
    //把各个功能，封装成每一个对应方法，
    //再通过类的对象来调用方法，实现功能

    //在一个类完成功能设计;
    //在一个类中定义对象，调用功能方法，实现目的

    boolean loop = true;
    double banlance = 0;
    double money = 0;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String details = "----零钱通明细-------";

    String note = "------消费说明-----";


    public void Menu() {
        //菜单显示
        System.out.println("显示零钱通菜单。。。。。");

        do {
            System.out.println("============零钱通菜单oop===========");
            System.out.println("\t\t\t1.  零钱通明细");
            System.out.println("\t\t\t2.  收益入账");
            System.out.println("\t\t\t3.  消费");
            System.out.println("\t\t\t4.  退    出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            //分支结构
            switch (key) {
                case "1":
                    this.detail();

                    break;
                case "2":
                    this.income();
                case "3":
                    this.pay();
                case "4":
                    this.exit();
                default:
                    System.out.println("输入有误，卿重新选择");

            }

        } while (loop);
        System.out.println("====退出零钱通=======");
    }

    public void detail() {
        //完成零钱通明细功能
        System.out.println(details);

    }

    public void income() {

        System.out.println("收益入账金额：");

        do {
            money = scanner.nextDouble();
            if (money <= 0) {
                System.out.println("金额小于零，请重新输入金额大于零");
                continue;
            }
        } while (money <= 0);
        banlance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + banlance;

    }

    public void pay() {
        System.out.println(" 消费金额：");
        do {
            money = scanner.nextDouble();
            if (money <= 0 || money > banlance) {
                System.out.println("金额小于零，请重新输入,您的余额还有" + banlance);
            }
        } while (money <= 0 || money > banlance);

        System.out.println("消费项目：");
        note = scanner.next();
        date = new Date();
        banlance -= money;
        details += "\n" + "消费" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + banlance;


    }


    public void exit() {
        String choice = "";

        while (true) {
            System.out.println("确定是否退出？输入y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if ("y".equals(choice)) {
            loop = false;

        }


    }


}
