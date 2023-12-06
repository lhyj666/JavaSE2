package com.chapter17.ticket;

public class SellTicket {
    public static void main(String[] args) {

//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        System.out.println("使用Runable接口");

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}

class SellTicket02 implements Runnable{

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