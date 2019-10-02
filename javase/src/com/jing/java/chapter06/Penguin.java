package com.jing.java.chapter06;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 5:09 PM
 **/
public class Penguin extends Pet{
    //private String name;
    //private int age;
    //private String gender;
    private String color;
    public Penguin(){

    }
    public Penguin(String name, int age, String gender, String color) {
        //this.name = name;
        //this.age = age;
        //this.gender = gender;
        super(name, age, gender);
        this.color = color;
    }

    public void play(){
        System.out.println("Penguin is playing...");
    }
}
