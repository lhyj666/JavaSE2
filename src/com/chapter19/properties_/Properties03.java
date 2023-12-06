package com.chapter19.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class Properties03 {
    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();

        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","adddd");

        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
        System.out.println(
                "b保存配置文件成功"
        );
    }
}
