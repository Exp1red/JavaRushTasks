package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                count++;
            } else {

            }

        }

        System.out.println(count);

    }



}
