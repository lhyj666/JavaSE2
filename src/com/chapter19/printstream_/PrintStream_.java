package com.chapter19.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out=System.out;
        out.print("joo,,hello");

        out.write("'教育局".getBytes());

        out.close();

        System.setOut(new PrintStream("d:\\f1.txt"));
        System.out.println("qnsoh-----------");

    }
}
