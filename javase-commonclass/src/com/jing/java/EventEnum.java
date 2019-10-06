package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 1:24 PM
 **/
public enum EventEnum {
    LAUNCH("launch"), PAVEGIEW("pageview"), EVENT("event");

    EventEnum(String name){
        this.name = name;
    }

    private String name;
    public void show(){
        System.out.println(this.name);
        EventEnum[] ee = values();
        for (int i = 0; i < ee.length; i++){
            System.out.println(ee[i]);
        }
    }
}
