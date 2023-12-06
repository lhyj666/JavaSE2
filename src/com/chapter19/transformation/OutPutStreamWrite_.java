package com.chapter19.transformation;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class OutPutStreamWrite_ {
    public static void main(String[] args) throws IOException {


        String filePath="d:\\a.txt";
        String charSet="gbk";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(filePath),charSet);

        osw.write("hi,教育");
        osw.close();
        System.out.println("按"+charSet+"b编码成功");
    }
}
