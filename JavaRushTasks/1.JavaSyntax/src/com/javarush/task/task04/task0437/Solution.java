package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        int b ;
        for ( int i =1 ; i<=10 ; i++){
            for (b = 1; b <= i ; b++ ) {
                System.out.print("8");

            }

            System.out.println();
            b= i;
        }

    }
}
