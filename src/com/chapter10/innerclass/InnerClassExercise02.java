package com.chapter10.innerclass;


public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("ring");
            }


        });

    }
}
interface Bell{
     void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        System.out.println("alarmclock");
        bell.ring();
    }
}