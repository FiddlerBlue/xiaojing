package com.jing.java.Homework;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:48 PM
 **/
public class TestMotoVehicle {
    public static void main(String[] args) {
        Car car = new Car(1, "BMW", "1");
        System.out.println("Rent fee is " + car.calcRent(30));
        Bus bus = new Bus(2, "Jinlong", 15);
        System.out.println("Rent fee is " + bus.calcRent(12));
    }
}
