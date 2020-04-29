package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        int count = 0;
        while(bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] strings = line.split(" ");
            for (String string : strings){
                for (String items : words){
                    if (string.equals(items)){
                        count++;
                    }
                }
            }
            if (count==2){
                System.out.println(line);
            }
            count = 0;
        }
        bufferedReader.close();
    }
}
