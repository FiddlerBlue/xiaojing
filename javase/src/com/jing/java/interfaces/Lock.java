package com.jing.java.interfaces;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 10:58 AM
 **/
public interface Lock {
    static final int count = 100;
    private void testPrivate(){
        System.out.println("haha");
    }
    void openLock();
    void closeLock();
    void photo();
}
