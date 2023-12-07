package com.chapter19.Homework_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class Homework02 {
    public static void main(String[] args) {

         String filePath="d:\\a.txt";
        BufferedReader br=null;
        String line=" ";
        int lineNum=0;

        try {
            br=new BufferedReader(new FileReader(filePath));
            while((line=br.readLine())!=null){
                System.out.println(++lineNum+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
