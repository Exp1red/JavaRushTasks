package com.javarush.task.task22.task2211;


import java.io.IOException;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        Charset windows1251 = Charset.forName("Windows-1251");
        Charset UTF8 = Charset.forName("UTF-8");

        byte[] buffer = new byte[fileInputStream.available()];

        while(fileInputStream.available() > 0){


            fileInputStream.read(buffer);
            String s = new String(buffer, windows1251);
            buffer = s.getBytes(UTF8);
            fileOutputStream.write(buffer);

           // writer.write(new String( new String(reader.readLine().getBytes(), windows1251).getBytes(UTF8)));

        }

    }
}
