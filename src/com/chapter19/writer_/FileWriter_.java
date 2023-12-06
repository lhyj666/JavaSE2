package com.chapter19.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class FileWriter_ {
    public static void main(String[] args) {

        String filePath="d:\\note.txt";

        FileWriter fileWriter=null;

        char[] chars={'a','b','c'};

        try {
            fileWriter=new FileWriter(filePath);

            fileWriter.write('H');

            fileWriter.write(chars);

            fileWriter.write("韩顺平".toCharArray(),0,3);

            fileWriter.write("你好北京");

            fileWriter.write("上海融入",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("结束");

    }
}
