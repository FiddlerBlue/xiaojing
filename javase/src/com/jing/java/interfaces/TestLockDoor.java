package com.jing.java.interfaces;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:10 AM
 **/
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
        lockDoor.openLock();
        lockDoor.openDoor();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.photo();
        System.out.println(lockDoor.count);
    }
}
