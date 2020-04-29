package com.javarush.task.task18.task1816;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        int[] bytes = new int[input.available()];
        while (input.available()>0){
            for (int i = 0 ; i < bytes.length ; i++) {
                bytes[i] =  input.read();
            }
        }
        int engCount = 0;
        for (int i =0 ; i <bytes.length ; i++) {
            if(bytes[i] >= 97 && bytes[i] <= 122||bytes[i]>=65 && bytes[i]<=90)
                engCount++;
        }
        input.close();
        System.out.println(engCount);
    }
}
