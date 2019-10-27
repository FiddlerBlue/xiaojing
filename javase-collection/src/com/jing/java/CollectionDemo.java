package com.jing.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 6:13 PM
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        collection.add(1.23);

        for (Iterator ite = collection.iterator(); ite.hasNext();){
            System.out.println(ite.next());
        }
        System.out.println("---------Now it's at the end-------");
        //强制类型转换
        ((ArrayList) collection).add(2, "mashibing");
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        collection1.add(1.23);
        //collection.retainAll(collection1);
        var objects = collection.toArray();

    }
}
