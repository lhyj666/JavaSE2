package com.chapter10.Abstract;

public class AA extends Template {

    @Override
    public void job() {//这里重写了job
        long num = 0;
        for (long i = 1; i <= 900000; i++) {
            num += i;
        }
    }
}
