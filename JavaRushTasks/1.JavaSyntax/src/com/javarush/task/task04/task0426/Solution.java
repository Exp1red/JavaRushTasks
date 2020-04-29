package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           int number = Integer.parseInt(reader.readLine());
           Solution solution = new Solution();
           System.out.println(solution.otr(number) + solution.chet(number));

    }

    public String otr (int number) {
        if (number < 0){
            return "отрицательное ";
        } else if (number > 0){
            return "положительное ";
        } else {
           return "ноль";
        }
    }

    public String chet (int number) {
        if (number%2 == 0 && number!=0 ) {
            return "четное число";
        } else if (number%2 != 0 && number!=0){
            return  "нечетное число";
        } else {
            return "";
        }
    }

}
