package com.jing.java.interfacelaptop;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 2:42 PM
 **/
public class IntelCPU implements CPU {
    private String brand;
    private String hz;

    public IntelCPU(String brand, String hz) {
        this.brand = brand;
        this.hz = hz;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getHZ() {
        return this.hz;
    }
}
