package com.chapter9.houseRent.service;

import com.chapter9.houseRent.domain.House;

public class HouseService {
    private House[] houses;//保存数组对象
    private int houseNums = 1;//记录当前房间对象数目
    private int Idcount = 1;

    public HouseService(int size) {//存储对象

        houses = new House[size];
        houses[0] = new House(1, "ja", "10889", "厦门", 1223, "出租");
    }

    //findById方法，返回一个House对象或者null
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }

        }
        return null;
    }

    //删除房屋
    public boolean del(int delId) {
        //首先找到对应数组对象下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            //要删除的房屋（id）是数组下标为i的元素
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {//说明delId不存在数组
            return false;
        }

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;//把当前存在的房屋信息的最后一个置空
        return true;

    }


    //添加房屋
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加");
            return false;
        }
        //把newhouse对象加入
        houses[houseNums++] = newHouse;
        //需要设置ID自增长

        newHouse.setId(++Idcount);
        return true;
    }

    public House[] list() {
        return houses;
    }


}
