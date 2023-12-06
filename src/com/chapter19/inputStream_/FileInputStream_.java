package com.chapter19.inputStream_;

import com.chapter19.file.FileInformation;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/4
 **/
public class FileInputStream_ {
    public static void main(String[] args) {


    }

    @Test
    public void readFile01(){
        String filePath="d:\\hello.txt";
        int readData=0;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(filePath);

            while ((readData=fileInputStream.read())!=-1){
                System.out.println((char) readData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @Test
    public void readFile02(){
        String filePath="d:\\hello.txt";
        int readData=0;

        int readLen=0;
        byte[]buf=new byte[8];
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(filePath);

            while ((readLen=fileInputStream.read(buf))!=-1){
                System.out.println(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
