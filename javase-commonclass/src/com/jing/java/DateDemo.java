package com.jing.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author Xiaojing
 * @create 10/5/2019
 * @desc Created by Xiaojing at 10:17 AM
 **/
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        Date date2 = dateFormat.parse("2019-10-13 19:30:27");
        System.out.println(date2);

        //获取的是当前系统的时间
        Calendar calendar = Calendar.getInstance();
        //设置需要的时间
        calendar.setTime(date2);
        System.out.println(calendar);
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONDAY));
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));

    }
}
