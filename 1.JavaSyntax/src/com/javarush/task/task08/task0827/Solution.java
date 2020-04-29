package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
        int x = Integer.parseInt(simpleDateFormat.format(date1));
        return x%2 != 0 ;
    }
}
