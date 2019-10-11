package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 12:43 PM
 **/
public class GenericImpl<B> implements GenericInf<B> {

    B bb;

    public B getBb() {
        return bb;
    }

    @Override
    public B test() {
        return bb;
    }

    @Override
    public void test2(B b) {
        bb = b;
    }
}
