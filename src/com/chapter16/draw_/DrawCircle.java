package com.chapter16.draw_;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{//面框

    private MyPanel mp=null;
    public static void main(String[] args) {

        new DrawCircle();


    }
    public DrawCircle(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
class MyPanel extends JPanel {//面板

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint方法调用");
////        g.drawOval(10,10,100,100);
//        g.setColor(Color.BLACK);
//        g.fillOval(10,10,100,100);
        Image image = Toolkit.getDefaultToolkit().getImage(("out/production/Javase.chapter10/com/chapter16/pg.png"));
//        g.drawImage(image,10,10,800,569,this);

        g.setColor(Color.BLACK);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("背景",100,100);


    }
}


