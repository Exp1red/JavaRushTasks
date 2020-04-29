package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0 ; i < 5 ; i++){
            strings.add(i, reader.readLine());
        }
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }
        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }
        }
    }
}
