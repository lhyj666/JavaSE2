package com.chapter11.homework;

public class Homework07 {
    public static void main(String[] args) {

        Car2 car2 = new Car2(30);
        car2.getAir().flow();
        Car2 car21 = new Car2(-1);
        car21.getAir().flow();

    }
}

class Car2{
    private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }
    class Air {//局部内部类
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40冷气");
            }else if(temperature<0){
                System.out.println("温度小于0暖气");
            }else{
                System.out.println("温暖");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}