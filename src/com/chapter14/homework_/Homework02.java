package com.chapter14.homework_;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        Car car =new Car("baoma",20000);
        Car car2=new Car("binli",3000000);

        arrayList.add(car2);
        arrayList.add(car);

        arrayList.remove(car);

        arrayList.contains(car);

        arrayList.size();

        arrayList.isEmpty();

        arrayList.clear();

        arrayList.addAll(arrayList);

        arrayList.containsAll(arrayList);

        arrayList.removeAll(arrayList);

        for (Object o: arrayList){
            System.out.println(o);
        }

        Iterator iterator=arrayList.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }


    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}