package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine() , true);
        FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(fileInputStream1);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream2);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        while (bufferedInputStream1.available()>0){
            bufferedOutputStream.write(bufferedInputStream1.read());
        }
        while (bufferedInputStream2.available()>0){
            bufferedOutputStream.write(bufferedInputStream2.read());
        }
        bufferedInputStream1.close();
        bufferedInputStream2.close();
        bufferedOutputStream.close();
    }
}
