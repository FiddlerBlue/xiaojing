package com.jing.java.chapter03;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        int[] arr = new int[5];
        int[] arr2 = new int[]{1,2,3,4,5};
        for (int i = 0; i<5; i++){
            array[i] = i+1;
            System.out.println(array[i]);
        }
    }
}
