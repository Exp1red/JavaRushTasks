package com.javarush.task.task18.task1820;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = nameReader.readLine();
        String fileName2 = nameReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        String num = reader.readLine();
        String[] nums = num.split(" ");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        for (int i = 0; i < nums.length; i++) {
            writer.write(Math.round(Double.parseDouble(nums[i]))+" ");
        }
        nameReader.close();
        reader.close();
        writer.close();
    }
}