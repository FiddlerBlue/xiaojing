package com.jing.java.interfacedemo;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 2:34 PM
 **/
public class Printer implements InkBox, Paper{
    @Override
    public void getWhiteandBlack() {

    }

    @Override
    public void getColor() {

    }

    @Override
    public void getA4() {

    }

    @Override
    public void getB5() {

    }

    public static void main(String[] args) {
        Printer printer = new Printer();

    }
}
