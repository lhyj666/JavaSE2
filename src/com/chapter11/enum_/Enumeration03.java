package com.chapter11.enum_;

public class Enumeration03 {
    public static void main(String[] args) {

        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);

    }
}
//使用enum类实现枚举
enum Season2 {

//定义对象
//    public static final Season SPRING=new Season2("春天","温暖");
//    public static final Season SUMMER=new Season2("夏天","温暖");
//换成使用枚举

    SPRING("春天","温暖"), SUMMER("夏天","炎热");;

    private String name;
    private String desc;
    private Season2(String name, String desc) {
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