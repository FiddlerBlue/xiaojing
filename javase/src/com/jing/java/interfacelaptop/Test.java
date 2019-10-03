package com.jing.java.interfacelaptop;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 2:55 PM
 **/
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new IntelCPU("Intel I750", "2.5GHz");
        computer.Compoment(cpu);
    }
}
