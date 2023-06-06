package com.chapter13.arrays_;

import java.util.Arrays;

public class ArraysMathod02 {
    public static void main(String[] args) {

        Integer[] arr ={1,2,90,123,567};

        int index= Arrays.binarySearch(arr,568);
        System.out.println("index="+index);


        Integer[] newArr=Arrays.copyOf(arr,arr.length-1);
        System.out.println(Arrays.toString(newArr));


        Integer[] num =new Integer[]{9,2,3};
        Arrays.fill(num,99);

        Integer[] arr2  ={1,2,90,124};
        boolean equals=Arrays.equals(arr,arr2);



    }
}
