package com.chapter17;

public class Thread02 {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        Thread thread =new Thread(dog);
//        thread.start();

//下面的Proxy模拟代理，只是具体说明上面Thread代理的实现过程2
        Tiger tiger = new Tiger();
        Proxy proxy = new Proxy(tiger);
        proxy.start();
    }
}
class Animal{}

class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("老虎，。。");
    }
}

class Proxy implements Runnable{

    private Runnable target=null;

    @Override
    public void run() {
        if(target!=null){
            target.run();
        }

    }

    public Proxy(Runnable target) {
        this.target = target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}



class Dog implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗叫。。。" + (++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }
        }
    }
}
