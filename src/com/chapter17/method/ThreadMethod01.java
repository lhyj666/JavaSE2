package com.chapter17.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {


        T t=new T();
        t.setName("han");
        t.setPriority(Thread.MIN_PRIORITY);

        t.start();

        for (int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("hi"+i);
        }

        t.interrupt();
        System.out.println("中断休眠");
        System.out.println(t.getName());
    }
}
class T extends Thread{


    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "茶包子----" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠===");
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interruput");
            }
        }
    }
}