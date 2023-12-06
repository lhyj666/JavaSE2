package com.chapter19.standard;

import java.util.Scanner;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class InputAndOutPut {
    public static void main(String[] args) {

        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());

        System.out.println("hspj");

        Scanner scanner =new Scanner(System.in);
        System.out.println("shuru");
        String next=scanner.next();
        System.out.println("next="+next);

    }
}
