package com.jing.java.internal;

/**
 * @author Xiaojing
 * @create 10/3/2019
 * @desc Created by Xiaojing at 3:58 PM
 **/
public class InternalClassDemo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
    }

    class InnerClass{
        private int age;
        public void test(){
            System.out.println("test");
            System.out.println(id);
        }
        class InnerInner{
            private int id;
            public void print(){
                System.out.println("print");
            }
        }
    }
}

class Test{

}
