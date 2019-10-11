package com.jing.java;

import java.util.*;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 11:08 AM
 **/
public class SetDemo implements Comparator<Dog> {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("123");
        set.add(1);
        set.add(true);
        set.add("123");
        System.out.println(set);
        Iterator iterator = set.iterator();
        /*while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for (Iterator iter = set.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());
        }

        /*Set treeSet = new TreeSet();
        treeSet.add(34);
        treeSet.add(1);
        treeSet.add(55);
        System.out.println(treeSet);
       System.out.println(((TreeSet)treeSet).ceiling(35));*/

        /*HashSet hashSet = new HashSet();
        hashSet.add(new Dog("Huahua", 99));
        hashSet.add(new Dog("Xiaohei", 92));
        hashSet.add(new Dog("Huahua", 99));
        System.out.println(hashSet);
        System.out.println(hashSet);

        Iterator iterator1 = hashSet.iterator();*/
        TreeSet treeSet = new TreeSet(new SetDemo());
        treeSet.add(new Dog("Huahua", 99));
        treeSet.add(new Dog("Xiaohei", 92));
        treeSet.add(new Dog("Huahua", 99));
        treeSet.add(new Dog("wangxiaobai", 80));
        treeSet.add(new Dog("wangxiao shaohua", 70));
        System.out.println(treeSet);
    }

    //return 0则不会被插入treeSet
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getRelationShip() > o2.getRelationShip()){
            return -1;
        }else if (o1.getRelationShip() <= o2.getRelationShip()){
            return 1;
        } else {
            return 1;
        }
    }
}
