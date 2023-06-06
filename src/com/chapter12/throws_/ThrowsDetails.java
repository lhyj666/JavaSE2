package com.chapter12.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class ThrowsDetails {
    public static void main(String[] args) {


    }
    public static void f2(){
        int n1=10;
        int n2=0;
        double res=n1/n2;

    }
    public static void f1() throws FileNotFoundException{
        f3();
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");

    }
    public static void f4(){
        f5();
    }
    public static void f5() throws RuntimeException{

    }

    class Father{
        public void method()throws RuntimeException{

        }
    }
    class Son extends  Father{
        @Override
        public void method() throws ArithmeticException{
            super.method();
        }
    }

}
