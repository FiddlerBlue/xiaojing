package com.jing.java.chapter03;

public class FibonacciRescursive {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println(getNumber(i)+"\t");
        }
    }

    public static int getNumber(int number){
        if (number==1 || number==2){
            return 1;
        }else
        {
            return getNumber(number-1)+getNumber(number-2);
        }
    }
}
