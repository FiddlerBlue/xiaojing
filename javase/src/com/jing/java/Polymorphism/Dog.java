package com.jing.java.Polymorphism;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 9:17 PM
 **/
public class Dog implements Pet {
    @Override
    public void feed() {
        System.out.println("The dog is feeding bones");
    }
}
