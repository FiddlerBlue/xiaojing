package com.jing.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 7:57 AM
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


        /* 迭代器使用方式1
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o.equals(1)){
                iterator.remove();
            }
        }*/

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o.equals(1)){
                //iterator.remove();
                iterator.set("Xiaojing");
            }
        }

        System.out.println("----------------------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        //增强for循环
        for(Object i : list){
            System.out.println(i);
        }
    }
}
