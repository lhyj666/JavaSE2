package com.chapter13.homework_;

public class Homework01 {
    public static void main(String[] args) {

        String str= "abcdklf";
        System.out.println("==交换前");
        System.out.println(str);
        try {
            str=reverse(str,1,4);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("==交换后");
        System.out.println(str);
    }
    public static String reverse(String str,int start,int end){
        char[] chars =str.toCharArray();
        char temp=' ';
        for (int i=start,j=end;i<j;j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;

        }
        return new String(chars);
    }
}
