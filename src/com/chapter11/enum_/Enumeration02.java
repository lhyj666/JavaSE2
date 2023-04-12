package com.chapter11.enum_;

import java.sql.SQLOutput;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);

    }
}

class Season{//枚举实现
    private String name;
    private String desc;

    public static final Season SPRING=new Season("春天","温暖");
    public static final Season SUMMER=new Season("夏天","温暖");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
