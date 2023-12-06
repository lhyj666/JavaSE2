package com.chapter18.tankgame3.tankgame03;

public class Shot implements Runnable{

    int x;
    int y;
    int direct=0;
    int speed=2;

    boolean isLive=true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true){

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct){
                case 0:
                    y-=speed;
                    break;
                case 1:
                    x+=speed;
                    break;
                case 2:
                    y+=speed;
                    break;
                case 3:
                    x-=speed;
            }

            System.out.println("子弹x="+x+"y="+y);

            if(!(x>=0 &&x<=1000&&y>=0&&y<=1000)){
                isLive=false;
                break;
            }

        }

    }
}
