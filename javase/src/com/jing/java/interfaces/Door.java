package com.jing.java.interfaces;

import org.jetbrains.annotations.Contract;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 10:56 AM
 **/
public abstract class Door {
    public abstract void openDoor();
    public abstract void closeDoor();
    @Contract(pure = true)
    public Door(){
        System.out.println("hahaha");
    }
}
