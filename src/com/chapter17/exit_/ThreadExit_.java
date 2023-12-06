package com.chapter17.exit_;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {

        T t1 = new T();
        t1.start();


        System.out.println("main线程休眠10s");
        Thread.sleep(5*1000);

        t1.setLoop(false);
    }
}
class T extends Thread{
    int count=0;

    private boolean loop=true;
    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("T子运行。。。。"+ (++count));
        }
    }
    public void setLoop(boolean loop){
        this.loop=loop;
    }
}