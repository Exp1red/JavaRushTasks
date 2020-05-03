package com.javarush.task.task32.task3210;

/* 
Используем RandomAccessFile
*/

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String... args) throws IOException {
        Path fileName = Paths.get(args[0]);
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        byte[] buff = new byte[text.length()];

        RandomAccessFile raf = new RandomAccessFile(String.valueOf(fileName), "rw");

        raf.seek(number);

        raf.read(buff , 0 , text.length());


        String resultFile = new String(buff);

        raf.seek(raf.length());

        if (resultFile.equals(text)){
            raf.write("true".getBytes());
        }else {
            raf.write("false".getBytes());
        }

        raf.close();

    }
}
