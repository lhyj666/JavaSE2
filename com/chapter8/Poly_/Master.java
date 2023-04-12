package com.chapter8.Poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //运用方法的多态，解决feed,用父类对象指向子类对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }
//    public void feed(Dog dog, Bone bone) {//对象作为形参
//        System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    public void feed(Cat cat, Fish fish) {
//             System.out.println("主人" + name + "给" + cat.getName() + "吃" + fish.getName());
//    }


}
