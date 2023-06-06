package com.chapter13.bignum_;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {

//        double d=199.1111111111111113333333336666666666666989978666;


        BigDecimal bigDecimal = new BigDecimal("1999999999999.999999999999999999");
        BigDecimal bigDecimal2 = new BigDecimal("2");

        System.out.println(bigDecimal);

        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        System.out.println(bigDecimal.divide(bigDecimal2));
    }
}
