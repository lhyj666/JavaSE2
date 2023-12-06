package com.chapter19.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        String filePath="d:\\R.java";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line;

        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
