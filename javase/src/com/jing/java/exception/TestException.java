package com.jing.java.exception;
import java.io.File;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 11:28 PM
 **/
public class TestException {
    public static void main(String[] args) {
        //System.out.println(1/0);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please input a dividend: ");
            int num1 = in.nextInt();
            System.out.println("Please input a divisor: ");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
            System.out.println("No exception happened till now.");
        } /*catch (Exception e){
            ystem.out.println("Exception happened!");
            System.out.println("-------------- The e.toString is as follows:");
            System.out.println(e.toString());
            System.out.println("-------------- The pringStackTrace is as follows:");
            e.printStackTrace();*/
        /*catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
        } catch(InputMismatchException e){
            System.out.println("Input Exception");
            e.printStackTrace();
        } */catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
            e.printStackTrace();
        } catch(Exception e){
            System.out.println("General Exception caught");
            e.printStackTrace();
        } finally{
            System.out.println("I'm finally!!!");
        }
        System.out.println("Thanks for using the program!");


    }
}
