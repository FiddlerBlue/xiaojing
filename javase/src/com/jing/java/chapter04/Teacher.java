package com.jing.java.chapter04;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 11:35 AM
 **/
public class Teacher {
    String name;
    int age;
    public void teach(){
        System.out.println("Teaching");
    }
    public Teacher(String name, int age){
        super();
        this.name = name;
        this.age = age;
        System.out.println(name + "\t" + age);
    }
    public Teacher(){
        System.out.print("Constructor with no parameters...");
    }
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Xiaojing", 24);
    }
}
