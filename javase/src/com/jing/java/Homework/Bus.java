package com.jing.java.Homework;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:34 PM
 **/
public final class Bus extends MotorVehicle {
    private int seatCount;
    public Bus(){}

    public Bus(int licenseNo, String brand, int seatCount){
        super(licenseNo, brand);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public int calcRent(int day) {
        if (seatCount > 16){
            return 1500 * day;
        } else {
            return 800 * day;
        }
    }
}
