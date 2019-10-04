package com.jing.java.exception;

/**
 * @author Xiaojing
 * @create 10/4/2019
 * @desc Created by Xiaojing at 11:53 PM
 **/
public class GenderException extends Exception {
    public GenderException(){
        System.out.println("Gender Exception!!");
    }
    public GenderException(String msg){
        System.out.println(msg);
    }
}
