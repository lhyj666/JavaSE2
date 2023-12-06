package com.chapter19.inputStream_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        String filePath="d:\\data.dat";

        ObjectInputStream osi=new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(osi.readInt());
        System.out.println(osi.readBoolean());
        System.out.println(osi.readChar());
        System.out.println(osi.readDouble());
        System.out.println(osi.readUTF());

        Object dog=osi.readObject();
        System.out.println("运行类型="+dog.getClass());
        System.out.println("dog信息"+dog);

        osi.close();

    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}