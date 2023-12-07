package com.chapter20.tankgame5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HspTankGame05 extends JFrame {

    MyPanel mp=null;

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        HspTankGame05 hspTankGame02 = new HspTankGame05();

    }
    public HspTankGame05() throws FileNotFoundException {
        System.out.println("请选择：1.新英雄，2，继续上局");
        String key=scanner.next();

        mp=new MyPanel(key);//面板绘图区域


        Thread thread = new Thread(mp);
        thread.start();

        this.add(mp);
        this.setSize(1300,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    if(key=="1"){
                        Recorder.setAllEnemyTankNum(0);
                    }
                    Recorder.keepRecord();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                System.out.println("保存");
                System.exit(0);

            }

        });
    }
}
