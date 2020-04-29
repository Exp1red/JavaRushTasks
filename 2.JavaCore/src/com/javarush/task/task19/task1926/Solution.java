package com.javarush.task.task19.task1926;

/* 
Перевертыши
1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(line);
            System.out.println(stringBuilder.reverse());
        }
        reader.close();
        fileReader.close();
        bufferedReader.close();
    }
}
