package com.jing.java;

/**
 * @author Xiaojing
 * @create 10/7/2019
 * @desc Created by Xiaojing at 11:36 AM
 **/
public class GeneralDemo {
    public static void main(String[] args) {
        /*GenericClass<String> genericString = new GenericClass<String>();
        genericString.setA("Zhao Xiaojing");
        genericString.setId(1);
        genericString.show();

        GenericClass<Integer> genericInteger = new GenericClass<Integer>();
        genericInteger.setA(34);
        genericInteger.setId(2);
        genericInteger.show();

        GenericClass<Dog> genericDog = new GenericClass<Dog>();
        genericDog.setA(new Dog("Shenqi Gou", 100));
        genericDog.setId(11);
        genericDog.show();
        System.out.println(genericDog.get());
        genericDog.set(new Dog("hehe", 88));

        GenericInf<String> genericInf = new GenericImpl<String>();
        genericInf.test2("abc");
        System.out.println(genericInf.test());

        GenericInf genericInf1 = new GenericImpl2();
        genericInf.test2("huhu, another one!!");
        System.out.println(genericInf.test());*/

        GenericMethod<String> genericMethod = new GenericMethod<String>();
        genericMethod.setT("ttt");
        genericMethod.show(123);
        genericMethod.show(true);

    }
}
