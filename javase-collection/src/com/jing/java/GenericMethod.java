package com.jing.java;

import java.util.Queue;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 1:04 PM
 **/
public class GenericMethod<T> {
    private T t;
    public <Q> void show(Q q){
        System.out.println(q);
        System.out.println(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
