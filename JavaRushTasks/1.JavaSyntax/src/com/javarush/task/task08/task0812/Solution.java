package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int currentCount = 1;
        int maxCount = 1;
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(i, number);
        }

            for (int i = 1; i < 10; i++) {
                if (numbers.get(i).equals(numbers.get(i - 1))) {
                    currentCount++;
                } else currentCount = 1;
                if (maxCount < currentCount) {
                    maxCount = currentCount;
                }

            }
        System.out.println(maxCount);
        }
    }


