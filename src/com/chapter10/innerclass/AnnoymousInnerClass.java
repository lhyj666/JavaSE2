package com.chapter10.innerclass;

/**
 * 匿名内部类
 */
public class AnnoymousInnerClass {
    public static void main(String[] args) {

        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}
class Outer04 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类：IA tiger=new IA（）；
        //编译类型IA
        //运行类型Duter04$1
        IA tiger = new IA() {

            @Override
            public void cry() {
                System.out.println("tiger--------");
            }
        };
        System.out.println("tiger运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();


        //基于普通类的匿名内部类：
        //编译类型Father
        //运行类型Duter04$2
        Father father = new Father("jacl") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();


        //基于抽象类的匿名内部类
        //编译类型Animal
        //运行类型Duter04$3
        Animal animal = new Animal() {

            @Override
            void eat() {
                System.out.println("小狗");
            }
        };
        System.out.println("animal对象的运行类型=" + animal.getClass());


    }
}

    //    private class IA {
//    }
//}
    interface IA {
        public void cry();
    }

    class Father {
        public Father(String name) {
            System.out.println("接受到name="+name);

        }

        public void test() {

        }
    }


abstract class Animal{//抽象类
    abstract void eat();
}