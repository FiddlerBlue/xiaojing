package com.jing.java.chapter05;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 1:02 PM
 **/

public class CodeBlockDemo {
    {
        System.out.println("Constructor block");
    }
    public CodeBlockDemo(){
        System.out.println("Constructor function");
    }
    public static void main(String[] args) {
        CodeBlockDemo codeBlockDemo = new CodeBlockDemo();
        codeBlockDemo.test();
        {
            System.out.println("main");
        }
    }
    public void test(){
        System.out.println("test");
        {
            System.out.println("What am I?");
        }
    }
}
