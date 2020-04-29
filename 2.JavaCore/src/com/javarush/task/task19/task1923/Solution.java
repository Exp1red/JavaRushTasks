package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.
*/

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        while (bufferedReader.ready()){
            String[] strings = bufferedReader.readLine().split(" ");
            for (String string : strings){
                String item = string;
                if (!(item.replaceAll("\\D", "").equals(""))){
                   bufferedWriter.write(string+" ");
               }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
