package com.chapter11.enum_;

public class EnumMethod {
    public static void main(String[] args) {

        Season2 spring = Season2.SPRING;
        System.out.println(spring.name());
        System.out.println(spring.ordinal());
        Season2[] values= Season2.values();
        for(Season2 season: values){
            System.out.println(season);
        }

        Season2 summer = Season2.valueOf("SUMMER");
        System.out.println("summer="+summer);
        System.out.println(summer.ordinal());


        System.out.println(Season2.SUMMER.compareTo(Season2.SPRING));
    }
}

