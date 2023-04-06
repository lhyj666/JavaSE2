package com.chapter10.Abstract;

public class AbstractExercise01 {
    public static void main(String[] args) {

        Manger jal = new Manger("jal", 9999, 2000);
        jal.setBonus(20);
        jal.work();

        CommonEmployee tom = new CommonEmployee("tom", 9220, 20002);
        tom.work();
    }
}
