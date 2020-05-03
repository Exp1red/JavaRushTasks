package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        while(true) {
            if (fileInputStream.available() >= 1000){

            fileInputStream = new FileInputStream(reader.readLine());

            }else {
                reader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {

    }
}
