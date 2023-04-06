package com.chapter8.object;

public class ToString_ {
    public static void main(String[] args) {
//tostring方法，对象哈希值十六进制与二进制转换
        Monster monster = new Monster("妖", "迅速", 1000);
        System.out.println(monster.toString() + "  hashcode=" + monster.hashCode());
//当直接输出一个对象时，tostring方法时会默认的调用=
// 重写方法前，调用toString方法，输出的是全类名+@+对象hashcode值的十六进制
//重写toString方法后，当直接输出一个对象时，tostring方法输出对象属性值
        System.out.println("==重写toString方法后，当直接输出一个对象时，tostring方法时会默认的调用==");
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}