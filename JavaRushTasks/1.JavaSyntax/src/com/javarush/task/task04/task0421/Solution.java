package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        int len1 = name1.length();
        int len2 = name2.length();
        if ( name1.equals(name2) ) {
            System.out.println("Имена идентичны");
        }else if ((name1 != name2) && len1 == len2 ){
            System.out.println("Длины имен равны");
        }else {

        }

    }
}
