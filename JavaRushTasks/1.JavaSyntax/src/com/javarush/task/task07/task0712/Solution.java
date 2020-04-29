package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) { list.add(i, reader.readLine()); }
        int smallString = list.get(0).length();
        int largeString = list.get(0).length();
        for (String string : list) {
            if (string.length() > largeString) { largeString = string.length(); }
            else if(string.length() < smallString) { smallString = string.length(); }
        }
        for (String string : list) {
            if (string.length() == largeString){ System.out.println(string);break; }
            else if (string.length() == smallString){System.out.println(string);break; }
        }
    }
}