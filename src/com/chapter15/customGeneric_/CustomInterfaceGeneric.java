package com.chapter15.customGeneric_;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {


    }
}
interface Iusb<U,R>{
    R get(U u);

    void hi(R r);


    abstract R hhhhhh(U u);

    void run(R r1, R r2, R r3);

    default R method( U u){
        return null;
    }


}