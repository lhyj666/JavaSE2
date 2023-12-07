package com.chapter20.tankgame6;

import java.io.*;
import java.util.Vector;

/**
 * @Author: kyp16
 * @Date: 2023/12/6
 * 该类用于记录相关信息的，和文件交互
 **/
public class Recorder {

    private static int allEnemyTankNum =0;
    private static FileWriter fw=null;
    private static BufferedWriter bw=null;

    private static BufferedReader br=null;
    private static String recordFile="d:\\myRecord.txt";

    private static Vector<EnemyTank> enemyTanks=null;


    private static  Vector<Node> nodes =new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks){
        Recorder.enemyTanks=enemyTanks;
    }


    public static Vector<Node>getNodesAndEnemtRankRes() throws FileNotFoundException {

        try {
            br=new BufferedReader(new FileReader(recordFile));

            allEnemyTankNum=Integer.parseInt((br.readLine()));

            String line="";
            while ((line =br.readLine())!=null){
                String[] xyd=line.split(" ");
                Node node=new Node(Integer.parseInt(xyd[0]),
                        Integer.parseInt(xyd[1])
                       ,
                                Integer.parseInt(xyd[2]));
                nodes.add(node);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nodes;
    }

    public static void keepRecord() throws IOException {

        try {
           bw=new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum+"\r\n");

            for(int i=0;i<enemyTanks.size();i++){

                EnemyTank enemyTank=enemyTanks.get(i);
                if(enemyTank.isLive){
                    String record=enemyTank.getX()+" "+enemyTank.getY()+" "+enemyTank.getDirect();
                    bw.write(record+"\r\n");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addAllEnemyTankNum(){
        Recorder.allEnemyTankNum++;
    }


}
