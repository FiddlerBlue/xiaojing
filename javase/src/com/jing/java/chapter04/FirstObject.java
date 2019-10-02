package com.jing.java.chapter04;

import java.util.Scanner;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 10:20 AM
 **/
public class FirstObject {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = str;
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        String str3 = new String("abc");
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
    }
}
