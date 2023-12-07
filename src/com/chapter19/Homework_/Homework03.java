package com.chapter19.Homework_;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class Homework03 {
    public static void main(String[] args) throws IOException {


        String filePath="src\\dog.properties";
        Properties propertie=new Properties();
        propertie.load(new FileReader(filePath));

        String name =propertie.get("name")+"";
        int age=Integer.parseInt(propertie.get("age")+"");
        String color=propertie.getProperty("color")+"";

        Dog dog=new Dog(name,age,color);
        System.out.println("dog对象");
        System.out.println(dog);

        String serFilePath="d:\\dog.dat";
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        oos.close();
        System.out.println("dog序列化完成");
    }

    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath="d:\\dog.dat";
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(serFilePath));

        Dog dog=(Dog)objectInputStream.readObject();
        System.out.println("反序列化成功dog，，");
        System.out.println(dog);

        objectInputStream.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {

        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}