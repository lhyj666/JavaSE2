package com.chapter19.OutputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class FileOutPutStream01 {
    public static void main(String[] args) {


    }

    @Test
    public void writeFile(){
        String filePath ="d:\\a.txt";
        FileOutputStream fileOutputStream=null;

        try {
            fileOutputStream=new FileOutputStream(filePath,true);

            fileOutputStream.write('a');

            String str="hello1";

//            fileOutputStream.write(str.getBytes());

            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

