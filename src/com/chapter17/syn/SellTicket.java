package com.chapter17.syn;



public class SellTicket {
    public static void main(String[] args) {

//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();


        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

class SellTicket03 implements Runnable{

    private static int ticketNum = 100;
    private boolean loop=true;

    Object object=new  Object();

    public synchronized static void m1(){}
    public /*synchronized*/ void sell() {

        synchronized (this) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。");
                loop = false;
                return;
            }

            try {
                Thread.sleep(59);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" +
                    Thread.currentThread().getName() + "卖出一张票"
                    + "剩余票=  " + (--ticketNum));

        }
    }
        @Override
        public void run () {

            while (loop) {

                sell();
            }

    }
}
class SellTicket01 extends Thread {


    private static int ticketNum = 100;

    @Override
    public void run() {

        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。");
                break;
            }

            try {
                Thread.sleep(59);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "卖出一张票"
                    + "剩余票=  " + (--ticketNum));
        }
    }
}