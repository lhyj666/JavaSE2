package com.chapter8.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manage manage = new Manage("刘备", 100, 20, 1.2);
        manage.setBonnus(2000);
        manage.printSal();
        Worker works = new Worker("关羽", 90, 22, 1.0);
        works.printSal();
    }
}
