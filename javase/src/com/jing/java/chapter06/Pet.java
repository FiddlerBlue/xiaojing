package com.jing.java.chapter06;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 5:11 PM
 **/
public class Pet {
    private String name;
    private int age;
    private String gender;

    public Pet(){
        System.out.println("Constructor Pet");
    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("play...");
    }
}
