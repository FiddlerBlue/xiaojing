package com.jing.java.Homework;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:33 PM
 **/
public abstract class MotorVehicle {
    private int licenceNo;
    private String brand;

    public abstract int calcRent(int day);
    public MotorVehicle(){
    }

    public MotorVehicle(int licenceNo, String brand){
        this.licenceNo = licenceNo;
        this.brand = brand;
    }
}
