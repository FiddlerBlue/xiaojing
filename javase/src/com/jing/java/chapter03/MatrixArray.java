package com.jing.java.chapter03;
import java.util.Arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[5];
        array[1] = new int[3];
        array[2] = new int[4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[0][4] = 5;
        //System.out.println(array[1][1]);

        int[][] arrayInit = {{1,2},{3,4,5},{6,7,8,9}};
        //System.out.println(arrayInit[2][3]);
        int[] arraySource = {11,24,3,14,5,16,37,28,9};
        int[] arrayDest = new int[10];
        System.arraycopy(arraySource,2,arrayDest,4,3);
        //for (int i = 0; i < arrayDest.length; i++){
        //    System.out.println(arrayDest[i]);
        //}
        Arrays.sort(arraySource);
        for (int i = 0; i < arraySource.length; i++){
            System.out.println(arraySource[i]);
        }
    }
}
