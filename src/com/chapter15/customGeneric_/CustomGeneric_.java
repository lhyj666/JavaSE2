package com.chapter15.customGeneric_;

public class CustomGeneric_ {
    public static void main(String[] args) {

        Tiger<Double,String,Integer> g = new Tiger<>("john");
        g.setT(10.9);

        Tiger<Double,String,Integer> g2 = new Tiger<>("john===--");






    }
}
class Tiger<T,R,M>{
    String name;
    R r;
    T t;
    M m;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public Tiger(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }
}