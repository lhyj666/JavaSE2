package com.chapter19.OutputStream_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {

        String filePath="d:\\data.dat";

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(1.9);
        oos.writeUTF("交易类型是");

        oos.writeObject(new Dog("蔡",30));

        System.out.println("完成");

        oos.close();



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