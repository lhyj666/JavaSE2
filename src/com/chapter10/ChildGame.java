package com.chapter10;

public class ChildGame {

    public static void main(String[] args) {


        Child child1 = new Child("hono");
        child1.join();
        child1.count++;
        Child child2 = new Child("ioioino");
        child2.join();
         child2.count++;
         //类变量可以通过类名直接访问
        System.out.println("共有"+Child.count+"个小孩加入游戏");

    }
}
class Child{
    private String name;
//类变量最大特点是可以让该类所有对象实例共享；
    public static int count=0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+" 加入了游戏");
    }

}