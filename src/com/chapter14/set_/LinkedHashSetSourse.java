package com.chapter14.set_;



import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSourse {
    public static void main(String[] args) {

        Set set=new LinkedHashSet();
        set.add(new String("aa"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘",1001));
        set.add(123);
        set.add("HSP");


        System.out.println("set="+set);






    }
}
class   Customer{
    private String name;
    private int no;

    public Customer(String name, int no) {

        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}