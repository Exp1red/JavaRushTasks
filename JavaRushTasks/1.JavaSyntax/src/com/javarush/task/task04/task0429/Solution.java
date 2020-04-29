package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int [3];

        for (int i=0; i < arr.length; i++ ) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int b = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                b++;
            } else if (arr[i] < 0) {
                a++;
            }

        }

        System.out.println("количество отрицательных чисел: "+a);
        System.out.println("количество положительных чисел: "+b);
    }

}

