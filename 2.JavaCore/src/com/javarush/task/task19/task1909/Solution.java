package com.javarush.task.task19.task1909;

/* 
Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
Результат вывести во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine().replaceAll("\\." , "\\!");
            bufferedWriter.write(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
