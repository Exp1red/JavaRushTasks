package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();
        BufferedInputStream inputFile1 = new BufferedInputStream(new FileInputStream(path1));
        BufferedInputStream inputFile2 = new BufferedInputStream(new FileInputStream(path2));

        byte[] bytes = new byte[inputFile1.available()+inputFile2.available()];

        int indexOfSecondFile = inputFile2.available();


        while (inputFile2.available()>0) {
            for (int i = 0; i < indexOfSecondFile; i++) {
                bytes[i] = (byte) inputFile2.read();
            }
        }

        while (inputFile1.available()>0) {
            for (int i = indexOfSecondFile; i < bytes.length; i++) {
                bytes[i] = (byte) inputFile1.read();
            }
        }
        inputFile1.close();
        inputFile2.close();

        FileOutputStream outputFile1 = new FileOutputStream(path1);

        for (int i = 0 ; i<bytes.length; i++){
            outputFile1.write(bytes[i]);
        }
        outputFile1.close();

    }
}
