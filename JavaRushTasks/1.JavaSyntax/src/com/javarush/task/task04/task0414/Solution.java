package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        solution.getAmountOfDays (a);



        }

    public void getAmountOfDays(int a) {
            int v = 366;
            int nv = 365;
        if (a%400 == 0){
            System.out.println("количество дней в году: "+v);
        }else if (a%100 == 0){
            System.out.println("количество дней в году: "+nv);
        }else if (a%4 == 0) {
            System.out.println("количество дней в году: "+v);
        }else {
            System.out.println("количество дней в году: "+nv);
        }
    }


}

