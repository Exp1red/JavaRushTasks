package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
ASCII код - 44
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count =0;
        while (fileInputStream.available() > 0){
          int number =  fileInputStream.read();
            if ((char) number == 44){
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
