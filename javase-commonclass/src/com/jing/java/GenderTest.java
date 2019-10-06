package com.jing.java;

import jdk.jfr.Event;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 1:22 PM
 **/
public class GenderTest {
    Gender gender1 = Gender.male;
    Gender gender2 = Gender.fmale;

    public static void main(String[] args) {
        EventEnum ee = EventEnum.LAUNCH;
        ee.show();
        String name = EventEnum.PAVEGIEW.name();
        System.out.println(name);
    }
}
