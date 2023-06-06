package com.chapter13.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("c="+c );
        System.out.println("年："+c.get(Calendar.YEAR));
    }
}
