package com.chapter19.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter=new PrintWriter(new FileWriter("d:\\f2.txt"));

        printWriter.print("背景上升");

        printWriter.close();

    }
}
