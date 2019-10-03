package com.jing.java.interfaces;

import java.io.Serializable;
import java.util.concurrent.Callable;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:00 AM
 **/
public class LockDoor extends Door implements Lock, Serializable, Callable {
    @Override
    public void openDoor() {
        System.out.println("Open the door.");
    }

    @Override
    public void closeDoor() {
        System.out.println("Close the door.");
    }

    @Override
    public void openLock() {
        System.out.println("Open the lock");
    }

    @Override
    public void closeLock() {
        System.out.println("Close the lock.");
    }

    @Override
    public Object call() throws Exception {
        return null;
    }

    @Override
    public void photo() {
        System.out.println("Take a picture and archive it...");
    }

    public LockDoor(){

    }
}
