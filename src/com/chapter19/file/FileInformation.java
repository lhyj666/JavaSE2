package com.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author: kyp16
 * @Date: 2023/12/4
 **/
public class FileInformation {

    public static void main(String[] args) {


    }

    @Test
    public  void info(){
        File file = new File("D:neww1.txt");

        System.out.println("文件名字="+file.getName());

        System.out.println("文件绝对路径="+file.getAbsolutePath());

        System.out.println("文件父级目录="+file.getParent());

        System.out.println("文件大小字节="+file.length());

        System.out.println("文件是否存在="+file.exists());

        System.out.println("是不是一个文件="+file.isFile());

        System.out.println("是不是一个目录="+file.isDirectory());

    }



}
