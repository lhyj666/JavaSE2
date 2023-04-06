package com.chapter10.codeblock;

public class CodeBlock01 {

    public static void main(String[] args) {

        new Movie("dfj");
        new Movie("qqwe",132);
        new Movie("qqwe",132,"akdf");
    }
}
class Movie{
    private String name;
    private double prive;
    private String director;
//三个构造器重载
    //如果在每个构造器都要执行的相同语句，
    //这是可以把相同语句放到代码块中
{
    System.out.println("电影");
    System.out.println("过高");
    System.out.println("过昂");
}
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double prive) {
        this.name = name;
        this.prive = prive;
    }

    public Movie(String name, double prive, String director) {
        this.name = name;
        this.prive = prive;
        this.director = director;
    }
}