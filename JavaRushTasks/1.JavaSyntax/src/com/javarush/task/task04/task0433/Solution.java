package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1 , b = 1 ;

        while(a<=10){

            while(b<=10){

                System.out.print("S");
                b++;
            }
            System.out.println();
            b = 1;
            a += 1;
        }


    }
}
