package com.chapter9.houseRent.view;

import com.chapter9.houseRent.domain.House;
import com.chapter9.houseRent.service.HouseService;
import com.chapter9.houseRent.utils.Utility;

public class HouseView {

    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    //根据id修改房屋信息，
    public void update() {
        System.out.println("+=======修改房屋信息==========");
        System.out.println("请选择修改房屋编号（-1表示退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("========放弃修改====");
            return;
        }
        //根据输入updateId，查找对象
        House house = houseService.findById(updateId);
        //返回的是引用类型，下面的修改会导致数据变化
        if (house == null) {
            System.out.println("=======修改房屋信息编号不存在===");
            return;
        }
        System.out.println("姓名(" + house.getName() + "):");
        //这里如果用户直接回车表示不修改该信息，默认:""
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);//修改数组元素
        }
        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");

        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("==========修改后那个的房屋信息======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");

        System.out.println(house);
    }


    //工具id查找房屋信息，调用serviced的findById

    public void findHouse() {
        System.out.println("=====查找房屋========");
        System.out.println("请输入要查找的id：");
        int findId = Utility.readInt();
        //调用方法find
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println("==========查找到的房屋信息======");
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");

            System.out.println(house);
        } else {
            System.out.println("==========查找房屋信息id不存在======");
        }
    }


    //退出系统
    public void exit() {
        //这里使用Utility.readConfimSelec
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //接受输入id，调用service的del
    public void delHouse() {
        System.out.println("==========");
        System.out.println("请输入待删除的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=======-1放弃删除===");
            return;

        }

        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {

            if (houseService.del(delId)) {
                System.out.println("=========删除成功=====");
            } else {
                System.out.println("======删除信息不存在======");
            }

        } else {
            System.out.println("=====不是Y，放弃删除'====");
        }
    }

    //接受输入id，调用service的add
    public void addHouse() {
        System.out.println("====添加房屋========");
        System.out.print("姓名");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址");
        String address = Utility.readString(16);
        System.out.print("月租");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);

        //id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);

        if (houseService.add(newHouse)) {
            System.out.println("====添加房屋成功======");
        } else {
            System.out.println("========添加房屋失败=====");
        }
    }

    public void listHouses() {
        System.out.println("=========房屋列表显示=======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }

            System.out.println(houses[i]);
        }
        System.out.println("=======房屋列表显示完毕=====");
    }

    public void mainMenu() {//主菜单

        do {
            System.out.println("=====房屋出租系统菜单====");
            System.out.println("\t\t\t1 新 增 房 屋");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("请输入选择（1-6）：");

            key = Utility.readChar();

            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':

                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':

                    exit();
                    break;

            }
        } while (loop);
    }
}
