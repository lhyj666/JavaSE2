package com.chapter11.homework;

public class Homework08 {
    public static void main(String[] args) {

        Color green = Color.YELLOW;
        green.show();
        switch (green){
            case YELLOW :
                System.out.println("黄色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            default:
                System.out.println("无匹配");
        }

    }
}
interface IMyInterface{
    public void show();
}
enum Color implements IMyInterface{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int reValue;
    private int greenValue;
    private int blueValue;

    Color(int reValue, int greenValue, int blueValue) {
        this.reValue = reValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性="+reValue+","+greenValue+","+blueValue);
    }
}