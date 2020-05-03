package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
    Path fileName = Paths.get(args[0]);
    int number = Integer.parseInt(args[1]);
    String text = args[2];

    RandomAccessFile randomAccessFile = new RandomAccessFile(String.valueOf(fileName), "w");
        if (randomAccessFile.length() < number){
            randomAccessFile.seek(randomAccessFile.length());
        }else {
            randomAccessFile.seek(number);
        }


        randomAccessFile.write(text.getBytes());
        randomAccessFile.close();

    }
}
