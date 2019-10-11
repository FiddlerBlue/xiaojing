package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 12:59 PM
 **/
public class GenericImpl2 implements GenericInf<String>{
    String ss;
    @Override
    public String test() {
        return ss;
    }

    @Override
    public void test2(String s) {
        ss = s;
    }
}
