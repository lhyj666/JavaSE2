package com.chapter19.writer_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class BufferedCopy_ {
    public static void main(String[] args) {

        String srcFilePath="d:\\R.java";
        String destFilePath="d:\\c.java";
        BufferedReader br=null;
        BufferedWriter bw=null;

        String line;

        try {
            br=new BufferedReader(new FileReader(srcFilePath));
            bw=new BufferedWriter(new FileWriter(destFilePath));

            while ((line= br.readLine())!=null){

                bw.write(line);

                bw.newLine();
            }
            System.out.println("拷贝结束");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(br!=null){
                    br.close();
                }

                if(bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
