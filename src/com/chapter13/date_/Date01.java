package com.chapter13.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {


        Date d1= new Date();
        System.out.println("当前日期="+d1);

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format= sdf.format(d1);
        System.out.println("当前日期="+format);

        String s="2022年05月31日 12:36:22 星期三";
        Date parse =sdf.parse(s);
        System.out.println("parse="+parse);
    }
}
