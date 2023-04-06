package com.chapter8.homework.homework5;


public class Homework05 {
    public static void main(String[] args) {

        Worker jack = new Worker("jack", 1000);
        jack.printSal();

        Peasant smit = new Peasant("smit", 1002);
        smit.printSal();

        Teacher lusy = new Teacher("lusy", 4000);
        lusy.setClassSal(200);
        lusy.printSal();

        Scientist hani = new Scientist("hani", 9000);
        hani.setBonus(2000);
        hani.printSal();

    }
}
