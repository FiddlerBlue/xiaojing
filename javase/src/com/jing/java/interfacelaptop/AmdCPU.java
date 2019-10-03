package com.jing.java.interfacelaptop;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 2:46 PM
 **/
public class AmdCPU implements CPU {
    private String brand;
    private String hz;

    public AmdCPU(String brand, String hz) {
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
