package com.chapter17.threaduse;

public class Tread01 {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续执行"+Thread.currentThread().getName());


        for(int i =0;i< 100;i++){
            System.out.println("主线程i="+i);
            Thread.sleep(1000);
        }



    }
}
class Cat extends Thread{

    int times=0;
    @Override
    public void run() {
        while (true){
        System.out.println("小猫咪。。"+(++times)+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(times==8){
            break;
        }
    }}
}
