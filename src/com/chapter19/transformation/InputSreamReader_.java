package com.chapter19.transformation;

import com.chapter19.reader_.BufferedReader_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class InputSreamReader_ {
    public static void main(String[ ] args) throws IOException {

        String filePath="d:\\a.txt" ;
        InputStreamReader isr=new InputStreamReader(new FileInputStream(filePath),"gbk");


        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        System.out.println("读取："+s);
        br.close();
    }
}
