package com.chapter10.interface_;

public class Interface02 {
    public static void main(String[] args) {
        new AA().hi();
    }
}
class AA implements AInterface{

    @Override
    public void hi() {
        System.out.println("AA.hi");
    }
}
