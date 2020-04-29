package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            list.add(i, reader.readLine());
        }
         int lengthString = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() > lengthString) {
                lengthString = list.get(i).length();
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}

