package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}
*/
public class Solution {
    public static void main(String[] args) {
//       String[] strings =  getTokens("level22.lesson13.task01", ".");
//        for (String s: strings) {
//            System.out.println(s);
//        }

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query , delimiter);
        List<String> list = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            list.add(token);
        }
        String[] arr = list.toArray(new String[list.size()]);

        return arr;
    }
}
