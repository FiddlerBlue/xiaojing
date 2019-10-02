package com.jing.java.chapter06;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 5:03 PM
 **/
public class Dog extends Pet{
    //private String name;
    //private int age;
    //private String gender;
    private String sound;
    //public void setName(String name){
    //    this.name = name;
    //}
    //public String getName(){
    //    return name;
    //}
    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }
    public Dog(){
        System.out.println("Dog Constructor");
    }
    public Dog(String name, int age, String gender, String sound) {
        //this.name = name;
        //this.age = age;
        //this.gender = gender;
        super(name, age, gender);
        this.sound = sound;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Dog is playing...");
    }

    public String toString(){
        return super.toString() + ", my sound is " + this.sound;
    }
}
