package com.chapter8.Poly_.objectPoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();//因为运行时，
        // 即执行到该行时animal运行类型是Dog，所以cry就是dog的cry

        animal = new Cat();
        animal.cry();
    }
}
