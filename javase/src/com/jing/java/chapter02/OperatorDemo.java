package com.jing.java.chapter02;

public class OperatorDemo {
    public static void main(String[] args) {
        //bit
        int numberLeft = 4;
        int numberRight = 5;
        System.out.println(numberLeft & numberRight);
        System.out.println(numberLeft | numberRight);
        System.out.println(numberLeft ^ numberRight);
        System.out.println(~numberLeft);
        System.out.println(~numberRight);
        System.out.println("-----------");
        System.out.println(2<<3);
        System.out.println(true?false:true?false:true);
        System.out.println(false?false:true?false:true);
    }
}
