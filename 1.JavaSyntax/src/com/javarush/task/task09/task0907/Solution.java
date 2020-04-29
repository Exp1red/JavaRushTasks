package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            //напишите тут ваш код
        }
    }
}