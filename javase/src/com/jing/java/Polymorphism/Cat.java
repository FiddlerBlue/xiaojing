package com.jing.java.Polymorphism;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 9:16 PM
 **/
public class Cat implements Pet {
    @Override
    public void feed() {
        System.out.println("The cat is feeding fish");
    }
}
