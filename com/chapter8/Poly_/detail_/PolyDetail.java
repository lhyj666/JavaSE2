package com.chapter8.Poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        Animal animal = new Cat();
        Object obj = new Cat();

        System.out.println("ok---");
        animal.eat();
        animal.show();
        animal.run();
        animal.sleep();

        Cat cat = (Cat) animal;
        cat.catchMouse();

        System.out.println("cat");
    }
}
