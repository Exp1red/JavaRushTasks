package com.javarush.task.task19.task1925;

/* 
Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new FileReader (args[0]));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter (args[1]));
       ArrayList<String> list = new ArrayList<>();
       while (bufferedReader.ready()){
            String[] str = bufferedReader.readLine().split(" ");
            for (String string : str ){
                if (string.length()  > 6 ){
                    list.add(string);
                }
            }
        }
       for (int i = 0 ; i < list.size(); i++){
           if(i==list.size()-1){
               bufferedWriter.write(list.get(i));
           }else {
               bufferedWriter.write(list.get(i) + ",");
           }
       }
       bufferedReader.close();
       bufferedWriter.close();
    }
}
