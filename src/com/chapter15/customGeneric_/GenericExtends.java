package com.chapter15.customGeneric_;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {


        ArrayList<Object> l1 = new ArrayList<>();


        (new uu()).pri(l1);
        ArrayList<String > l2 = new ArrayList<>();
        (new uu()).pri(l2);

    }
    public static void pri(List<?> c){}

    public void priu(List<?> c){}
}
class uu<T>{
    public static void pri(List<?> c){}
    public <R> void priii(List<T> c){}
}