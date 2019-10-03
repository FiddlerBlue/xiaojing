package com.jing.java.interfaces;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:38 AM
 **/
public class UDisk implements Usb {
    @Override
    public void dataTransfer() {
        System.out.println("UDisk is applicable for data transferring...");
    }
}
