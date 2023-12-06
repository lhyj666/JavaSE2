package com.chapter17;

public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime=Runtime.getRuntime();

        int cpuNums=runtime.availableProcessors();
        System.out.println("当前cpu个数="+cpuNums);
    }
}
