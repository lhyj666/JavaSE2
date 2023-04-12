package com.chapter8.debug_;

import java.util.Arrays;

public class Dubug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println("he100");
        System.out.println("he200");
        System.out.println("he300");
        System.out.println("he400");
        System.out.println("he500");
        System.out.println("he600");
        System.out.println("he100");
    }
}
