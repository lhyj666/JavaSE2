package com.chapter19.file;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/4
 **/
public class FileCreate {
    public static void main(String[] args) {


    }

    @Test
    public void create01(){

        String filePath="D:news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

@Test
    public void create02(){

        File parentFile =new  File("D:");
        String fileName="news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void creat03(){

        String parentPath="D:";
        String fileName="news03.txt";
        File file =new File(parentPath,fileName);

        try {
            file.createNewFile();
            System.out.println("创建文件");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
