package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i<40; i++){
            System.out.println(s.substring(i));
        }
    }
}

