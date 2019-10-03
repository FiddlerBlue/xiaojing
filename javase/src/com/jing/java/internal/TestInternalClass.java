package com.jing.java.internal;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 4:06 PM
 **/
public class TestInternalClass {
    public static void main(String[] args) {
        InternalClassDemo internalClassDemo = new InternalClassDemo();
        internalClassDemo.show();
        System.out.println(internalClassDemo.getName());

        InternalClassDemo.InnerClass inner = internalClassDemo.new InnerClass();
        inner.test();

        InternalClassDemo.InnerClass.InnerInner innerInner = internalClassDemo.new InnerClass().new InnerInner();
    }
}
