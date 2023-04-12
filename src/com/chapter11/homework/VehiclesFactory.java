package com.chapter11.homework;

public class VehiclesFactory {

    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }

    private VehiclesFactory() {

    }

    public static Boat getBoat(){
        return new Boat();
    }

}
