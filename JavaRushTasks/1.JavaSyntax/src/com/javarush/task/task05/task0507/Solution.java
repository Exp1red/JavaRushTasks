package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number != -1 ){
                sum = sum +number;
                count++;
            } else {
                double middle = sum/count;
                System.out.println(middle);
                break;
            }


        }

    }
}

