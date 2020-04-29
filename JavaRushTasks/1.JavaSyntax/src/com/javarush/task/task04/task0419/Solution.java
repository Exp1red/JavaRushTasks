package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());



        int Max1 =  Max(a,b);
        int Max2 = Max(c,d);
        if(Max1>Max2||Max1==Max2) System.out.println(Max1);
        else System.out.println(Max2);

    }



    public static int Max(int a, int b){
        if(a>b) return a;
        else return b;




    }


}
