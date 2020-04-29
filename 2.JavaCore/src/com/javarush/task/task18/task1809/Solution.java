package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        reader.close();
        int[] bytes = new int[fileInputStream.available()];
        int i = 0;
        while(fileInputStream.available() > 0){
            bytes[i] = fileInputStream.read();
            i++;
        }
        for (int j = bytes.length-1; j >= 0 ; j--) {
            fileOutputStream.write(bytes[j]);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
