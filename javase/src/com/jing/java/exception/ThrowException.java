package com.jing.java.exception;

/**
 * @author Xiaojing
 * @create 10/4/2019
 * @desc Created by Xiaojing at 11:34 PM
 **/
public class ThrowException {
    public static void main(String[] args) throws Exception{
        /*try {
            test();
        } catch(Exception e)
        {
            e.printStackTrace();
        }*/
        try {
            show();
        } catch(GenderException e){
            e.printStackTrace();
        }
        System.out.println("hehe");
    }

    public static void test() throws Exception
    {
        System.out.println(1/0);
    }

    public static void show() throws Exception{
        String gender = "1234";
        if (gender.equals("man")){
            System.out.println("man");
        } else if (gender.equals("woman")){
            System.out.println("woman");
        } else{
            GenderException ge = new GenderException("Gender Exception with message!!");
            throw ge;
        }

    }
}
