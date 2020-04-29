package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("4", "5", "6"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("7", "8", "9"));
        ArrayList<String>[] arrayOfStringList = new ArrayList[0];
        arrayOfStringList = new ArrayList[]{list1, list2, list3};
        return arrayOfStringList;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}