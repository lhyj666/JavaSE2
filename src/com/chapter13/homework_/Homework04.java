package com.chapter13.homework_;

public class Homework04 {
    public static void main(String[] args) {

        String str= "34r12khj41UUHJHK  //";
        countStr(str);
    }
    public static void countStr(String str){
        if(str == null){
            System.out.println("输入 不为怒；null");
            return;
        }
        int strlen= str.length();
        int numCount=0;
        int lowCount=0;
        int upperCount=0;
        int otherCount=0;
        for(int i=0; i<strlen; i++){
            if(str.charAt(i)>= '0'&& str.charAt(i)<='9'){
                numCount++;

            } else if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
                lowCount++;

            } else if (str.charAt(i) >='A'&& str.charAt(i)<= 'Z') {
                upperCount++;

            }else {
                otherCount++;
            }

        }
        System.out.println(numCount+lowCount+upperCount+otherCount);

    }
}
