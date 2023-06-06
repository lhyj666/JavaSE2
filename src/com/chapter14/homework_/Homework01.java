package com.chapter14.homework_;



import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("确诊病例jwqrrjowq13231313231rqqrqw1414rqwrqwr"));
        arrayList.add(new News("印度41411414jwqrjowq123231231232rqrqrqwrqwrqwr"));

        int size=arrayList.size();
        for(int i=size-1; i>= 0;i--){
//            System.out.println(arrayList.get(i));
            News news =(News)arrayList.get(i);
            System.out.println( processTitle(news.getTitle()));

        }



    }
    public static String processTitle(String title){

        if(title == null){
            return "";
        }

        if(title.length()>15){
            return title.substring(0,15)+"...";
        }else{

            return title;
        }


    }













}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}