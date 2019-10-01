package com.jing.java.chapter02;

public class TypeConverter {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        byte b = 10;
        int a = 20;
        byte c = (byte) (a + b);
        System.out.println(c);
        System.out.println("Just want to check how conflict works!");
    }
}
