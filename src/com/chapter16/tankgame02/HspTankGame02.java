package com.chapter16.tankgame02;

import javax.swing.*;

public class HspTankGame02 extends JFrame {

    MyPanel mp=null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame02 = new HspTankGame02();

    }
    public HspTankGame02(){
        mp=new MyPanel();//面板绘图区域
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
