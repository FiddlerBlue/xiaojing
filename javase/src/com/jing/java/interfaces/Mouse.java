package com.jing.java.interfaces;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:37 AM
 **/
public class Mouse implements Usb{
    @Override
    public void dataTransfer() {
        System.out.println("Mouse is applicable for data transferring...");
    }
}
