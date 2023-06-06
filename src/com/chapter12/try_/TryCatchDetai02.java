package com.chapter12.try_;

import java.io.PrintStream;

public class TryCatchDetai02 {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            person=null;
            System.out.println(person.getName());//空指针
            int n1=10;
            int n2=0;
            int res=n1/n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常" + e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println("算术异常" + e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }


    }
}
class Person{
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}