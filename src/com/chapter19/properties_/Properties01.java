package com.chapter19.properties_;

import com.chapter19.reader_.BufferedReader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class Properties01 {
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new FileReader("src\\mysql.properties"));

        String line=" ";
        while ((line=br.readLine())!=null){
            String [] split=line.split("=");
            System.out.println(split[0]+"值："+split[1]);
        }
        br.close();
    }
}
