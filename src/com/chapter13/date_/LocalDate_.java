package com.chapter13.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {

        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年="+ldt.getYear());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String format=dateTimeFormatter.format(ldt);
        System.out.println("格式化日期="+format);
    }
}
