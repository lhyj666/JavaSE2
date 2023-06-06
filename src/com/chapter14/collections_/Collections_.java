package com.chapter14.collections_;




import java.util.*;

public class Collections_ {
    public static void main(String[] args) {

        List list=new ArrayList();
        list.add("tom");
        list.add("okk");
        list.add("fdoja");
        list.add("wefoj");


        Collections.reverse(list);

        Collections.shuffle(list);

        Collections.sort(list);

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                    return ((String) o2).compareTo((String) o1);
                }
        });

        Collections.swap(list,0,1);

        Collections.max(list);

        Object maxObject=Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  ((String) o2).compareTo((String) o1);
            }
        });

        Object minObject=Collections.min(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  ((String) o2).compareTo((String) o1);
            }
        });



    }
}
