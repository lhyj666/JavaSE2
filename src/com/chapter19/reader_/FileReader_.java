package com.chapter19.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class FileReader_ {
    public static void main(String[] args) {

        String filePath="d:\\story.txt";
        FileReader fileReader=null;

        int data=0;

        try {
            fileReader=new FileReader(filePath);

            while ((data =fileReader.read())!=-1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(fileReader !=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readFile01(){

        System.out.println("第二种");
        String filePath="d:\\story.txt";
        FileReader fileReader=null;

        int readLen=0;

        char[] buf=new char[3];

        try {
            fileReader=new FileReader(filePath);

            while ((readLen =fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(fileReader !=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
