package com.jing.java;

import java.util.Objects;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 9:48 AM
 **/
public class Dog{
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

    /*@Override
    public String toString() {
        return "name='" + name + '\'' +
                ", relationShip=" + relationShip;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return relationShip == dog.relationShip &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, relationShip);
    }

   /*
   * 此比较器按照name的长度比较
   * */
  /*  @Override
    public int compareTo(Object o) {
        Dog dog = (Dog) o;
        if (dog.name.length() > this.name.length()){
            return 1;
        } else if (dog.name.length() < this.name.length()){
            return -1;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", relationShip=" + relationShip +
                '}';
    }
}
