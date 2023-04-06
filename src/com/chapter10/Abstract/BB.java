package com.chapter10.Abstract;

public class BB extends Template{
    @Override
    public void job() {
        long num= 1;
        for (long  i = 0; i < 100000; i++) {
            num*=i;
        }
    }
}
