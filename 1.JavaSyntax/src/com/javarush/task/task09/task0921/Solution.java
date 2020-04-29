package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        while (true) {
            try {
                inputNumbers.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
             for (int i = 0 ; i<inputNumbers.size() ; i++){
                 System.out.println(inputNumbers.get(i));
             }
                break;
            }
        }
    }
}
