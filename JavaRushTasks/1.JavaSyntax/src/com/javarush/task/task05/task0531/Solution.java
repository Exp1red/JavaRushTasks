package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a,b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b ,int c , int d , int e) {
        if (Math.min(a, b ) < Math.min(c, d ) && Math.min(a, b )<Math.min(d, e )){
            return Math.min(a, b );
        } else if (Math.min(c, d ) < Math.min(a, b ) && Math.min(c, d ) < Math.min(a, e ) ){
            return Math.min(c, d);
        } else {
            return Math.min(d, e);
        }
    }
}
