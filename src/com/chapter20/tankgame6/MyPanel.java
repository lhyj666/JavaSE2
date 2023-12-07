package com.chapter20.tankgame6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable{

    static Vector<EnemyTank> enemyTanks=new Vector<>();

    static Vector<Bomb> bombs= new Vector<>();

    Vector<Node> nodes=new Vector<>();
    Image image1=null;
    Image image2=null;
    Image image3=null;
    int enemyTankSize=3;
    Hero hero=null;
    public MyPanel(String key) throws FileNotFoundException {//初始化坦克

        nodes= Recorder.getNodesAndEnemtRankRes();
        Recorder.setEnemyTanks(enemyTanks);

        hero=new Hero(500,100);
        hero.setSpeed(100);


        switch (key){
            case "1":
                for(int i=0;i<enemyTankSize;i++){
                    EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);

                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(2);

                    new Thread(enemyTank).start();
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());

                    enemyTank.shots.add(shot);
                    new Thread(shot).start();

                    enemyTanks.add(enemyTank);
                }

                break;
            case "2":
                for(int i=0;i<nodes.size();i++){

                    Node node=nodes.get(i);
                    EnemyTank enemyTank = new EnemyTank(node.getX(),node.getY());

                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(node.getDirect());

                    new Thread(enemyTank).start();
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());

                    enemyTank.shots.add(shot);
                    new Thread(shot).start();

                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("输入错误");
        }


        image1=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }




    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            hero.setDirect(0);

            if(hero.getY()>0){
                hero.moveUp();

            }
        }else if (e.getKeyCode()==KeyEvent.VK_D){
            hero.setDirect(1);


            if(hero.getX()<1000){
                hero.moveRight();

            }
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            hero.setDirect(2);

            if(hero.getY()<750){
                hero.moveDown();

            }
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirect(3);

            if(hero.getX()>0){
                hero.moveLeft();

            }

        }

        if(e.getKeyCode()==KeyEvent.VK_J){
            System.out.println("用户按下j，开始设计");

            //判断子弹是否销毁，若销毁或者空，则发射新的
            if(hero.shot==null || !hero.shot.isLive){
                hero.shotEnemyTank();

            }
//            hero.shotEnemyTank();
        }


        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




            hitEnemyTank();
            hitHero();
            this.repaint();
            System.out.println("子弹被重绘");
        }
    }

    public void showInfo(Graphics g){

        g.setColor(Color.BLACK);
        Font font=new Font("宋体",Font.BOLD,25);
        g.setFont(font);

        g.drawString("你累计击毁敌方坦克",1020,30);

        drawTank(1024,60,g,0,0);
        g.setColor(Color.black);
        g.drawString(Recorder.getAllEnemyTankNum()+"",1080,100);
    }
    @Override
    public void paint(Graphics g) {//画出坦克
        super.paint(g);
        g.fillRect(0,0,1000,750);

        showInfo(g);
        if(hero !=null&& hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }


        if(hero.shot!=null&&hero.shot.isLive==true){
            System.out.println("子弹被绘制---");
            g.fill3DRect(hero.shot.x,hero.shot.y,3,3,false);
        }

//        for (int i=0;i<hero.shots.size();i++){
//            Shot shot=hero.shots.get(i);
//            if(shot !=null&& shot.isLive==true){
//                g.draw3DRect(shot.x,shot.y,3,3,false);
//            }else {
//                hero.shots.remove(shot);
//            }
//        }


        for (int i=0;i<bombs.size();i++){
            Bomb bomb = bombs.get(i);
            if(bomb.life>6){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);;

            }else if(bomb.life>3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);;

            }else{
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);;

            }
            bomb.lifeDown();

            if(bomb.life==0){
                bombs.remove(bomb);
            }
        }




        for(int i=0 ;i<enemyTanks.size();i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 3, 3, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

     public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct ){
            case 0:
                g.fill3DRect(x,y,10,60  ,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+20,x+20,y);
                break;
            case 1:
                g.fill3DRect(x,y,60 ,10 ,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x,y,10,60  ,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x,y,60 ,10 ,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("无处理");
        }
     }

    public void hitEnemyTank(){
//
//        for(int j=0;j<hero.shots.size();j++){
//
//            Shot shot =hero.shots.get(j);
//
//
//            if(shot!=null&& shot.isLive){
//                for (int i=0;i<enemyTanks.size();i++){
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(shot,enemyTank);
//                }
//            }
//        }
        //单颗子弹是否集中坦克
        if(hero.shot !=null&& hero.shot.isLive){
            for (int i=0;i<enemyTanks.size();i++){
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot,enemyTank);
            }
        }
    }


    public void hitHero(){//击中我方坦克

        for(int i=0; i<enemyTanks.size();i++){

            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j=0;j<enemyTank.shots.size();j++){
                Shot shot = enemyTank.shots.get(j);
                if(hero.isLive && shot.isLive){
                    hitTank(shot,hero);
                }
            }
        }
    }

    public static void hitTank(Shot s, Tank enemyTank){
//击中敌人坦克
        switch (enemyTank.getDirect()){
            case 0://坦克向上与向下合并
            case 2://坦克向下
                if(s.x>enemyTank.getX()&&s.x<enemyTank.getX()+40
                && s.y>enemyTank.getY() && s.y<enemyTank.getY()+60){
                    s.isLive=false;
                    enemyTank.isLive=false;

                    enemyTanks.remove(enemyTank);


                    if(enemyTank instanceof EnemyTank){
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;

            case 1://坦克向右与向左合并
            case 3:
                if(s.x>enemyTank.getX()&&s.x<enemyTank.getX()+60
                        && s.y>enemyTank.getY() && s.y<enemyTank.getY()+40){
                    s.isLive=false;
                    enemyTank.isLive=false;
                    enemyTanks.remove(enemyTank);

                    if(enemyTank instanceof EnemyTank){
                        Recorder.addAllEnemyTankNum();
                    }

                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;



                }
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }
}
