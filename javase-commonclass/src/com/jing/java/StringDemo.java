package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 9:57 AM
 **/
public class StringDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append(1.234).append("abc").append(true);
        stringBuffer.delete(2,4);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123").append(1).append(false);
        System.out.println(stringBuilder);
    }
}
