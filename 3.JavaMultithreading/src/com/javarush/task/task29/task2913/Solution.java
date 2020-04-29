package com.javarush.task.task29.task2913;

import java.util.*;

/* 
Замена рекурсии 
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
//        List <Integer> tmp = new ArrayList<>();
//        List <Integer> list = new ArrayList<>();
//        for (int i = 0 ; i < 1000 ; i++) {
//            list.add(i);
//        }
//
//        if (a < b) {
//            tmp = list.subList(a , b+1);
//        }else {
//            tmp = list.subList(b , a+1);
//        }
//
//        if (a < b){
//            return tmp.toString();
//        }else {
//
//            Collections.reverse(tmp);
//
//            return tmp.toString();
//        }

        StringBuilder result = new StringBuilder(String.valueOf(a));
        while(a != b) { result = a > b ? result.append(" " + --a) : result.append(" " + ++a); }
        return result.toString();
    }


    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}