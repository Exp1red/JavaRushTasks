package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/
/*
0 - getStackTrace

1 - имя метода (свое имя)

2 - имя метода кто вызвал [1]

3 - имя метода кто вызвал [2]
 */

public class Solution {
    public static void main(String[] args) {
        method1();
    }
    public static int method1() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();

        method2();
        return  element[2].getLineNumber();
    }

    public static int method2() {
        StackTraceElement [] element = Thread.currentThread().getStackTrace();
        method3();
        return  element[2].getLineNumber();
    }

    public static int method3() {
        StackTraceElement [] element = Thread.currentThread().getStackTrace();
        method4();
        return  element[2].getLineNumber();
    }

    public static int method4() {
        StackTraceElement [] element = Thread.currentThread().getStackTrace();
        method5();
        return  element[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement [] element = Thread.currentThread().getStackTrace();
        return  element[2].getLineNumber();
    }
}
