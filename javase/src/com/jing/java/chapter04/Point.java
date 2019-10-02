package com.jing.java.chapter04;

import java.util.Scanner;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 11:51 AM
 **/
public class Point {
    int axisX;
    int axisY;
    public Point(){
        axisX = 0;
        axisY = 0;
    }
    public Point(int axisX, int axisY){
        this();
        this.axisX = axisX;
        this.axisY = axisY;
    }
    public double getDistanceBetweenTwoPoints(Point pointDest){
        return (Math.sqrt(Math.pow((this.axisX - pointDest.axisX),2) + Math.pow((this.axisY-pointDest.axisY),2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the X axis for the first point");
        int xValueSource = sc.nextInt();
        System.out.println("Please input the Y axis for the first point");
        int yValueSource = sc.nextInt();
        System.out.println("Please input the X axis for the second point");
        int xValueDest = sc.nextInt();
        System.out.println("Please input the Y axis for the second point");
        int yValueDest = sc.nextInt();
        Point pointSource = new Point(xValueSource, yValueSource);
        Point pointDest = new Point(xValueDest, yValueDest);
        double calcResult = pointSource.getDistanceBetweenTwoPoints(pointDest);
        System.out.println("The distance between 2 points is: " + calcResult);
    }
}
