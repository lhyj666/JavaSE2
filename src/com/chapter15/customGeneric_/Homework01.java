package com.chapter15.customGeneric_;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {
    public static void main(String[] args) {


    }
    @Test
    public void testList(){
        Dao<User> dao=new Dao<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,110,"ppck"));
        dao.save("003",new User(3,210,"oock"));

        List<User> list=dao.list();
        System.out.println("list="+list);

        dao.update("003",new User(3,58,"mo"));
        dao.delete("001");
        System.out.println("=======");
        list=dao.list();
        System.out.println("list="+list);

    }
}
