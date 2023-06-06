package com.chapter12.customexception_;

public class ThrowException {
    public static void main(String[] args) {

        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();

    }
}
class ReturnExceptionDemo{
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("A的finally");
        }

    }
    static void methodB(){
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("B的finally");
        }

    }
}
