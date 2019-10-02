package com.jing.java.chapter06;

import java.util.Objects;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 8:13 PM
 **/
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }


    public static void main(String[] args) {
        Student firstStudent = new Student("Jing", 29, "Fmale");
        Student secondStudent = new Student("Jing", 29, "Fmale");
        //secondStudent.setName("Amanda");
        System.out.println(firstStudent == secondStudent);
        System.out.println(firstStudent.equals(secondStudent));
    }

}
