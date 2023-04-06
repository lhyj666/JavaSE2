package com.chapter8.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//项目零钱通
public class SmallChangeSys {
    public static void main(String[] args) {

        //定义变量
        boolean loop = true;
        double banlance = 0;
        double money = 0;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "----零钱通明细-------";

        String note = "------消费说明-----";
        char num;
        //菜单
        do {
            System.out.println("============零钱通===========");
            System.out.println("\t\t\t1.  零钱通明细");
            System.out.println("\t\t\t2.  收益入账");
            System.out.println("\t\t\t3.  消费");
            System.out.println("\t\t\t4.  退    出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            //分支结构
            switch (key) {
                case "1":
                    System.out.println(details);

                    break;
                case "2":
                    System.out.println("收益入账金额：");

                    do {
                        money = scanner.nextDouble();
                        if (money <= 0) {
                            System.out.println("金额小于零，请重新输入金额大于零");
                        }
                    } while (money <= 0);
                    banlance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + banlance;
                    break;
                case "3":
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


                    break;
                case "4":
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

                    } else {
                    }
                    break;

                default:
                    System.out.println("输入有误，卿重新选择");

            }

        } while (loop);
        System.out.println("====退出零钱通=======");
    }

}
