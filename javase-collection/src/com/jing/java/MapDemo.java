package com.jing.java;

import java.util.*;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 5:33 PM
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Xiaojing", 1);
        map.put("Yaming", 5);
        map.put("Roy", 2);
        map.put("Liwei", 3);
        map.put("Wangtao", 4);

        map.put("Wangtao2", 6);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsValue(3));
        map.remove("Wangtao2");
        System.out.println(map);

        //返回key的Set
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key + " = " + map.get(key));
        }

        Collection<Integer> values = map.values();
        for (Integer value: values){
            System.out.println(value);
        }

        Set<String> keys2 = map.keySet();
        Iterator<String> iterator = keys2.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s + " = " + map.get(s));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next.getKey() + "--" + next.getValue());
        }

    }
}
