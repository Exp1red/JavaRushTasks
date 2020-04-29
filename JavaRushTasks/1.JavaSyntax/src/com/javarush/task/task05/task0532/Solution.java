package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valid = 0;

        int n = Integer.parseInt(reader.readLine());


        if (n > 0 ){
            int max  = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n - 1; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > max) max = number;
            }
            System.out.println(max);
        } else {

        }

    }
}
