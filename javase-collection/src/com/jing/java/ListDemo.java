package com.jing.java;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 11:50 PM
 **/
public class ListDemo {
    public static void main(String[] args) {
        /*List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        list.add("a");
        list.add("b");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        List listZhao = List.of("abc","def","zhaoxiaojing");
        System.out.println("-------this is mine--------");
        System.out.println(listZhao);
        System.out.println(List.of("abc","def"));
        List list1 = list.subList(0, 2);
        list.set(1,101);
        System.out.println(list);*/
        List list = new ArrayList<>();
        list.add("zhao");
        list.add("xiao");
        list.add("jing");
        list.add(true);
        list.add(9999);
        list.addAll(1,List.of("huang","zhao","zheng"));

        System.out.println(list);

        List list1 = new LinkedList();
        list1.add(0,"xiaojing");
        list1.add("huangzhaozheng");
        list1.add("zhaoronggui");
        list1.add(1,"miaomiao");
        list1.add(0,"zhaoheng");
        for (ListIterator listIterator = list1.listIterator(); listIterator.hasNext();){
            System.out.println(listIterator.next());
        }

    }
}
