package com.chapter13.arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers ={1,20,90};
        System.out.println(Arrays.toString(integers));

        Integer arr[] ={1,-8,9,0,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
