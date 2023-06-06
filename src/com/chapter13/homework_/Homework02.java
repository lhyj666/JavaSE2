package com.chapter13.homework_;

public class Homework02 {
    public static void main(String[] args) {


        String name="t2";
        String pwd="132342";
        String email="jack@shjo.com";
        try{
            userRegister(name,pwd,email);
            System.out.println("成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String pwd, String email) {

        if(!(name!=null && pwd!=null&& email!=null)){
            throw new RuntimeException("参数不为null");
        }
        int userlength = name.length();
        if (!(userlength >= 2 && userlength <= 4)) {
            throw new RuntimeException("用户长度2,3，或4");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度6，要求全是数字");

        }

        int i=email.indexOf("@");
        int j=email.indexOf(".");
        if(!(i>0 && j>i )){
            throw  new RuntimeException("有@与。，且@在。前");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }




}

