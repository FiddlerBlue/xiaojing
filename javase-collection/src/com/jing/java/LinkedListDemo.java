package com.jing.java;

import java.util.LinkedList;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 6:12 AM
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");
        System.out.println(linkedList);
        linkedList.add(2,"Zhao Xiaojing");
        linkedList.add(123);
        System.out.println(linkedList.indexOf(123));
        System.out.println(linkedList);
    }
}
