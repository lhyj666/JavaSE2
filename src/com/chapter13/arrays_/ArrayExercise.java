package com.chapter13.arrays_;


import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {

    public static void main(String[] args) {

        Book[] books=new Book[3];
        books[0]=new Book("红楼",1111);
        books[1]=new Book("金瓶梅",90);
        books[2]=new Book("java入门",300);


        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1=(Book)o1;
                Book book2=(Book)o2;
                double priceVal=book2.getPrice()- book1.getPrice();
                if(priceVal>0){
                    return -1;
                }else if(priceVal < 0){
                    return 1;
                }else {
                    return 0;
                }


            }

        });
        System.out.println((Arrays.toString(books)));

    }
}

class Book {
    private String name;
    private double price;

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

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}