package com.chapter10;

public class StaticMethod {
    public static void main(String[] args) {

        Stu tom = new Stu("otm");
        tom.payFee(100);

        Stu jon = new Stu(" jon");
        jon.payFee(200);

        Stu.showFee();

        System.out.println(MyTools.calSum(10,30));



    }
}
class MyTools{
    public static double calSum(double n1 ,double n2){
        return n1+n2;
    }

}
class Stu{
    private String name;
    //定义一个静态变量，累计学费
    private static double fee=0;
    public Stu(String name){
        this.name=name;
    }
    //static静态方法
    //可以访问静态变量，
    public static void payFee(double fee){
        Stu.fee+= fee;//累积到
    }
    public static void  showFee(){
        System.out.println("总学费有："+ Stu.fee);
    }

}
