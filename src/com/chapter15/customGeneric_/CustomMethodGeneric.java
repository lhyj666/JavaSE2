package com.chapter15.customGeneric_;


import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {

        Car car = new Car();
        car.fly("som","ffj");

        Fish<String , ArrayList> fish=new Fish<>();
        fish.hello(new ArrayList(),"fka");

        System.out.println(car);
        System.out.println(fish);
    }
}

class Fish<T,R>{
    public<U,M> void eat(U u,M m){

    }
    public void hi(T t){
    }
    public <K> void hello(R r,K k){}


}
class Car{
    public void run(){}

    public<T,R> void fly(T t,R r){}













}