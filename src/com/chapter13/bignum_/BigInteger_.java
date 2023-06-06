package com.chapter13.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {

        long l = 22222222;
        System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("2222222222222222");
        BigInteger bigInteger2 = new BigInteger("1122222222");
        System.out.println(bigInteger);
        System.out.println();

        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);

        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);

        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);

        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);


    }
}
