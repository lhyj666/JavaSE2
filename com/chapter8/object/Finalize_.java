package com.chapter8.object;

public class Finalize_ {
    public static void main(String[] args) {

        Car bm = new Car("宝马");
        bm = null;
        System.gc();

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("销毁了对象car"+ name);
//        System.out.println("释放资源");
//    }
}
