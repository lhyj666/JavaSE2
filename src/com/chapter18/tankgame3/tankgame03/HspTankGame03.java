package com.chapter18.tankgame3.tankgame03;

import javax.swing.*;

public class HspTankGame03 extends JFrame {

    MyPanel mp=null;
    public static void main(String[] args) {

        HspTankGame03 hspTankGame02 = new HspTankGame03();

    }
    public HspTankGame03(){
        mp=new MyPanel();//面板绘图区域

        Thread thread = new Thread(mp);
        thread.start();

        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
