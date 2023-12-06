package com.chapter19.writer_;

import com.chapter19.reader_.BufferedReader_;

import java.io.*;

/**
 * @Author: kyp16
 * @Date: 2023/12/5
 **/
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {

        String filePath="d:\\ok.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        bufferedWriter.write("heww1,");
        bufferedWriter.newLine();
        bufferedWriter.write("heww2,");
        bufferedWriter.write("heww3,");

        bufferedWriter.close();

    }
}
