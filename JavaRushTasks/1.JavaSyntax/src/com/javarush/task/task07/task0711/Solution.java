package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =  0; i < 5 ; i++) {
            list.add(i, reader.readLine());
        }
        for (int i = 0; i<13 ; i++){
            list.add(0,list.remove(4));
        }
        for (int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
