package com.chapter12.try_;

public class TryCatchDetail {
    public static void main(String[] args) {


        try {
            String str="hapjy";
            int a=Integer.parseInt(str);
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息="+e.getMessage());
        } finally {
            System.out.println("finall执行");
        }


    }
}
