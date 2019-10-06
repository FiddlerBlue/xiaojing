package com.jing.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.lang.Integer;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 10:54 AM
 **/
public class MyCalendar {
    int[][] myDate;
    public static void main(String[] args) throws Exception{
        MyCalendar myCalendar = new MyCalendar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the Date (yyyymmdd): ");
        try{
            String getInput = sc.next();
            Date inputDate = new SimpleDateFormat("yyyyMMdd").parse(getInput);

            myCalendar.CalculateCalendar(inputDate);
        } catch (Exception e)
        {
            System.out.println("Input wrong format!");
            e.printStackTrace();
        }
        finally {
            System.out.println("Thanks for using this programme.");
        }
    }

    public void CalculateCalendar(Date thisDate) throws Exception{
        myDate = new int[6][7];
        int firstDayOfWeek;  //本月第一天位于本周的第几天
        int dayOfWeek;   //此日期位于一周的第几天
        int weekOfMonth;  //次日期位于本月的第几周
        int year;
        int month;



        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        //the first day of month
        //Date thisDate = dateFormat.parse(thisYear + "-" + thisMonth + "-" + thisDay);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(thisDate);
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        /*year = String.valueOf(calendar.get(Calendar.YEAR));
        month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        if (month.length() < 2)
        {
            month = "0" + month;
        }
        Date firstDate = dateFormat.parse(year + month + "01");*/



        //get the dayOfWeek

/*        System.out.println(dayOfWeek);
        System.out.println(weekOfMonth);*/

        // get the day of the week
        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(firstDate);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        //设置myDate[0]
        calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)-(firstDayOfWeek ));
        System.out.println("Su" + "\t" + "Mo" + "\t" + "Tu" + "\t" + "We" + "\t" + "Tu" + "\t" + "Fr" + "\t" + "Sa");
        //i: 6 weeks.  j: 7 days a week
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                //一天天加上去
                calendar.set(Calendar.DATE,calendar.get(Calendar.DATE) + 1);
                myDate[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                if ((j == (dayOfWeek - 1)) && (i == (weekOfMonth - 1))){
                    System.out.print(myDate[i][j] + "*\t");
                } else{
                    System.out.print(myDate[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }


}
