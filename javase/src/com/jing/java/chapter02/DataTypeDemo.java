package com.jing.java.chapter02;
import java.lang.System;
/*
* byte: 1 byte -128 ~ 127
* short: 2 bytes  -32768 ~ 32767
* int: 4 bytes  -2147483648 ~ 2147483647
* long: 8 bytes
* */

public class DataTypeDemo {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        long l = 1111111111;
        float f1 = 2.12231232434343F;
        float f2 = 2.1223123643634533F;
        double d1 = 2.12353252352353525235;
        double d2 = 2.13535325235252352353;
        char a = 'a';
        String as = "A";
        char ch = '\b';
        System.out.println (b+s+l);
        System.out.println(f1==f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("["+ch+"]");
    }
}
