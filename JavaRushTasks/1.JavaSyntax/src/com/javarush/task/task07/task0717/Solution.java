package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0 ; i < 10 ; i++){
            list.add(i, reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
       for (String string : list) {
           System.out.println(string);
       }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i < list.size() ; i++) {
            list.add(i, list.get(i) );
            i++;
        }
        return list;
    }
}
