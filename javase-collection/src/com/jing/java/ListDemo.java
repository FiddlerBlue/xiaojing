package com.jing.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 11:50 PM
 **/
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        list.add("a");
        list.add("b");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        System.out.println(List.of("abc","def"));
        List list1 = list.subList(0, 2);
        list.set(1,101);
        System.out.println(list);

    }
}
