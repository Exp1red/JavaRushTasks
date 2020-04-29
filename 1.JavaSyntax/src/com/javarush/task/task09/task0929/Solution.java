package com.javarush.task.task09.task0929;

/* 
Обогатим код функциональностью!
*/

import java.io.*;

public class Solution {
      static   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();



            InputStream fileInputStream = getInputStream(sourceFileName);
            OutputStream fileOutputStream = getOutputStream(destinationFileName);


            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();

    }

    public static InputStream getInputStream(String fileName) throws IOException {


        try {
            return new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            return new FileInputStream(reader.readLine());
        }


    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

