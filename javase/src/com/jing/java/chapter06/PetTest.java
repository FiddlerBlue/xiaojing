package com.jing.java.chapter06;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 5:12 PM
 **/
public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("black", 12, "male", "ruff");
        dog.setName("Big Yellow");
        System.out.println(dog.getName());
        dog.play();
    }
}
