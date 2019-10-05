package com.jing.java;

import java.sql.SQLOutput;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 6:39 AM
 **/
public class IntegerDemo {
    public static void main(String[] args) {
        /*int a = 1000;
        Integer i = new Integer(1000);
        Integer i4 = new Integer(1000);

        Integer i5 = Integer.valueOf(1000);

        Integer i2 = Integer.valueOf(a);
        int i3 = i.intValue();
        System.out.println(a == i);
        System.out.println(i.equals(i3));
        System.out.println(i == i4);
        System.out.println(i.equals(i4));

        Float f1 = new Float(3.14);
        Double d1 = new Double(3.14);*/
        String str = "abc";
        System.out.println(str.charAt(0));
        System.out.println(str.concat("cde"));
        String s = "abcdefghijklmn";

        String a = "abc";
        String b = new String("abc");
        b = b.intern();
        System.out.println(a == b);

        String f = "a" + "b" + "c";
        String a1 = "a";
        String a2 = "b";
        String a3 = "c";
        String f1 = a1 + a2 + a3;
        f1 = f1.intern();



    }
}
