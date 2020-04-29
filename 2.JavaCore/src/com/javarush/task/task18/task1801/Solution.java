package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int maxByte =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while (true){
            int byteValue  =  file.read();
                if (byteValue > maxByte){
                    maxByte = byteValue;
                }
            if (byteValue == -1){
                System.out.println(maxByte);
                break;
            }
        }
        reader.close();
        file.close();
    }
}
