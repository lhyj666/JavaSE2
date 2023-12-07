package com.chapter19.Homework_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 **/
public class Homework01 {
    public static void main(String[] args) throws IOException {


        String directoryPath="d:\\mytemp";

        File file =new File(directoryPath);

        if(!file.exists()){
            if(file.mkdirs()){
                System.out.println("创建"+directoryPath+"创建成功");


            }else {
                System.out.println("创建"+directoryPath+"创建失败");
            }
        }

        String filePath=directoryPath +"\\hello.txt";
        file=new File(filePath);

        if(!file.exists()){
            if(file.createNewFile()){
                System.out.println(filePath+"创建成功");


                BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hellp,wkoo教育");
                bufferedWriter.close();
            }else{
                System.out.println(filePath+"创建失败");
            }

        }else {
            System.out.println(filePath+"已经存在，不在重复创建");
        }
    }
}
