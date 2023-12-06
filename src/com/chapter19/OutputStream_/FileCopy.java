package com.chapter19.OutputStream_;

import com.chapter19.inputStream_.FileInputStream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {

        String SrcfilePath="d:\\a.txt";
        String DestfilePath="d:\\b.txt";
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream(SrcfilePath);
            fileOutputStream=new FileOutputStream(DestfilePath);
            byte[] buf=new byte[1024];

            int readlen =0;
            while((readlen=fileInputStream.read(buf))!=-1){

                fileOutputStream.write(buf,0,readlen);
            }

            System.out.println("拷贝0k");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(fileInputStream !=null){
                    fileInputStream.close();
                }
                if(fileOutputStream !=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
