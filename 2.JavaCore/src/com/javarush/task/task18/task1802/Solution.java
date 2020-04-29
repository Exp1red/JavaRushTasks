package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int minByte =255;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while (file.available() > 0){
            int byteValue  =  file.read();
            if (byteValue < minByte){
                minByte = byteValue;
            }
        }
        System.out.println(minByte);
        reader.close();
        file.close();
    }
}
