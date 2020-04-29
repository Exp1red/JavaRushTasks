package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int[] chars = new int[fileInputStream.available()];

        int charsSpace = 0;

        while (fileInputStream.available() > 0){
            for(int i = 0; i<chars.length; i++){
                chars[i] =  fileInputStream.read();
            }
        }
        fileInputStream.close();

        for (int i = 0 ; i<chars.length;  i++){
           if ( chars[i] == 32 ){
               charsSpace++;
           }
        }


        System.out.print(new DecimalFormat("#0.00").format((double) charsSpace * 100 / chars.length).replace(',', '.'));
    }
}
