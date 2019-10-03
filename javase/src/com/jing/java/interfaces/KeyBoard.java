package com.jing.java.interfaces;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:39 AM
 **/
public class KeyBoard implements Usb {
    @Override
    public void dataTransfer() {
        System.out.println("Keyboard is applicable for data transferring...");
    }
}
