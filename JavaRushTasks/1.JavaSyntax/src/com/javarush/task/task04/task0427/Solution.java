package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        int number = Integer.parseInt(reader.readLine());


        if (solution.exit(number)){
            System.out.println(solution.chet(number)+solution.printE(solution.digits(number)));
        } else {

        }



    }


    public String chet (int number){
        if (number%2 == 0) {
            return "четное ";
        } else if (number%2 !=0){
            return "нечетное ";
        } else  {
            return "";
        }
    }

    public int digits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public String printE ( int count){
        if ( count == 1) {
            return "однозначное число";
        } else if (count ==2) {
            return "двузначное число";
        } else if (count ==3) {
            return "трехзначное число";
        } else {
            return "";
        }
    }

    public boolean exit (int number) {
        if (number >= 1 && number <= 999){
            return true;
        } else {
            return false;
        }
    }

}
