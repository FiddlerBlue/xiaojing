package com.jing.java.internal;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 5:28 PM
 **/
public class Outer {
    private String name = "zhangsan";
    private int id;

    public void test(int number){
        System.out.println("test");

        class InnerMethodClass{
            private String name;
            public void test(){
                System.out.println("test InnerMethodClass..");
                System.out.println(number);
            }
        }
    }

    static class InnerClass{
        private String name;
        public void show(){
            System.out.println("show");
        }
    }

    class Inner{
        private String name = "lisi";

        public void show(){
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        InnerClass innerClass = new Outer.InnerClass();
    }
}
