package com.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author: kyp16
 * @Date: 2023/12/4
 **/
public class DIrectory_ {
    public static void main(String[] args) {


    }

    @Test
    public void m1() {

        String filePath = "d:news1.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }

        } else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void m2() {

        String filePath = "d:\\demo02";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }

        } else {
            System.out.println("文件不存在");
        }
    }

    @Test
    public void m3() {

        String directoryPath= "d:\\demo02\\a\\b\\c";
        File file = new File(directoryPath);

        if (file.exists()) {
            System.out.println(directoryPath + "存在--");
        }else {
            if (file.mkdirs()) {
                System.out.println(directoryPath + "创建成功");
            } else {
                System.out.println(directoryPath + "创建失败");

            }
        }


    }
}
