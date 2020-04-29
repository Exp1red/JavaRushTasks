package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0 ;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] str = line.split("\\W");
            for (String word: str) {
                if (word.equals("world")){
                    count++;
                }
            }

        }
        fileReader.close();
        bufferedReader.close();

        System.out.println(count);
    }
}
