package com.jing.java.internal;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 5:59 PM
 **/
public class NoNameInnerClassDemo {
    public static void main(String[] args) {
        //以下是new了一个接口的实现类，被称为匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
