package com.jing.java.Polymorphism;

import java.sql.SQLOutput;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 9:18 PM
 **/
public class Master {
    public void feed(Pet pet){
        pet.feed();
    }

    public Pet purchasePet(int type){
        if (type == 1){
            return new Dog();
        } else if (type == 2){
            return new Cat();
        } else{
            return null;
        }
    }

    public static void main(String[] args) {
        Master master = new Master();
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet p;
        master.feed(dog);
        master.feed(cat);
        Pet pet = master.purchasePet(1);
        if (pet instanceof Dog){
            System.out.println("I purchased a dog!");
        } else if(pet instanceof Cat){
            System.out.println("I purchased a cat!");
        } else{
            System.out.println("I purchased a pet!");
        }
    }
}
