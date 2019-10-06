package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 9:48 AM
 **/
public class Dog {
    private String name;
    private int relationShip;

    public Dog(String name, int relationShip) {
        this.name = name;
        this.relationShip = relationShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(int relationShip) {
        this.relationShip = relationShip;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", relationShip=" + relationShip;
    }
}
