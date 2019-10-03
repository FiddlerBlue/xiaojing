package com.jing.java.interfacelaptop;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 2:53 PM
 **/
public class Computer {
    public Computer() {
    }

    public void Compoment(CPU cpu){
        System.out.println("CPU: " + cpu.getBrand() + ", " + cpu.getHZ());
    }
}
