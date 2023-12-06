package com.chapter19.transformation;

import com.chapter19.reader_.BufferedReader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class CodeQuestion {
    public static void main(String[] args) throws IOException {



        String filePath="d:a.txt";
        BufferedReader br=new BufferedReader(new FileReader(filePath));

        String s=br.readLine();
        System.out.println("读取:"+s);
        br.close();
        
    }
}
