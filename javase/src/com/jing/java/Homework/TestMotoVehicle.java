package com.jing.java.Homework;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:48 PM
 **/
public class TestMotoVehicle {
    public static void main(String[] args) {
        MotorVehicle[] moto = new MotorVehicle[4];
        moto[0] = new Car(1, "BMW", "1");
        moto[1] = new Car(1, "BMW", "1");
        moto[2] = new Car(2, "BIEK", "2");
        moto[3] = new Bus(3, "JINLONG", 34);

        int totalMoney = 0;
        for (int i = 0; i < moto.length; i++){
            totalMoney += moto[i].calcRent(5);
        }
        System.out.println("Total rent is " + totalMoney);
  /*      Car car = new Car(1, "BMW", "1");
        System.out.println("Rent fee is " + car.calcRent(30));
        Bus bus = new Bus(2, "Jinlong", 15);
        System.out.println("Rent fee is " + bus.calcRent(12));*/
    }
}
