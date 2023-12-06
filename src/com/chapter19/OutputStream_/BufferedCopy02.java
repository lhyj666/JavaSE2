package com.chapter19.OutputStream_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class BufferedCopy02 {
    public static void main(String[] args) {

        String srcFilePath="d:\\mv1.mp4";
        String destFilePath="d:\\ww.mp4";

        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;

        try {
            bis=new BufferedInputStream(new FileInputStream(srcFilePath));
            bos=new BufferedOutputStream(new FileOutputStream(destFilePath));

            byte[] buff=new byte[1024];
            int readLen=0;

            while ((readLen=bis.read(buff))!=-1){
                bos.write(buff,0,readLen);
            }
            System.out.println("文件拷贝完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(bis!=null){

                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
