package com.jing.java.Homework;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:34 PM
 **/
public final class Car extends MotorVehicle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(){
    }

    public Car(String type){
        this.type = type;
    }

    public Car(int licenseNo, String brand, String type){
        super(licenseNo, brand);
        this.type = type;
    }

    @Override
    public int calcRent(int day) {
        //return 0;
        if (type.equals("0")){
            return 600 * day;
        }else if (type.equals("1")){
            return 500 * day;
        } else if (type.equals("2")){
            return 300 * day;
        } else {
            System.out.println("The type doesn't fit!");
            return 0;
        }
    }
}
