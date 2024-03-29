package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 11:34 AM
 **/
public class GenericClass<A> {

    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show(){
        System.out.println("id : "+id+" ,A : "+a);
    }

    public A get(){
        return a;
    }

    public void set(A a){
        System.out.println("执行set方法：" + a);
    }
}
