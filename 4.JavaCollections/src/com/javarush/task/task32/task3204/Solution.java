package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Random random = new Random();

        for (int i = 0; i< 2; i++) {
            byteArrayOutputStream.write('0' + random.nextInt('9' - '0') + 1);
            byteArrayOutputStream.write('a' + random.nextInt('z' - 'a') + 1);
            byteArrayOutputStream.write('A' + random.nextInt('Z' - 'A') + 1);
        }

            byteArrayOutputStream.write('A' + random.nextInt('Z' - 'A') + 1);
            byteArrayOutputStream.write('0' + random.nextInt('9' - '0') + 1);

        return byteArrayOutputStream;
    }
}