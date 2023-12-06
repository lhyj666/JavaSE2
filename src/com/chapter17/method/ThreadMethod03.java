package com.chapter17.method;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {

        MyDaemonThead myDaemonThead = new MyDaemonThead();
        myDaemonThead.setDaemon(true);

        myDaemonThead.start();

        for (int i=1;i<=10;i++){
            System.out.println("宝强---");
            Thread.sleep(1000);
        }

    }
}

class MyDaemonThead extends Thread{
    public void run(){
        for(;;){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("ayu聊天----");
        }
    }
}