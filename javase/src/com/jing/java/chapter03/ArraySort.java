package com.jing.java.chapter03;
/*Bubble Sort
* @author: Xiaojing
* */
public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[] {15,1,3,18,12,8,6,20,13,17,4,9};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
