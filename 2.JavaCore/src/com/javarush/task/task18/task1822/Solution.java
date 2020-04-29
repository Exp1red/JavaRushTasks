package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.

Информация по каждому товару хранится в отдельной строке.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader pathReader = new BufferedReader(new InputStreamReader(System.in));
        String path = pathReader.readLine();
        FileInputStream inputStream = new FileInputStream (path);
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

        String line = reader.readLine();
        while (line!=null) {
           line = reader.readLine();
            if (line.startsWith(args[0] + " ")){
                System.out.println(line);
                break;
            }
        }
        inputStream.close();
        reader.close();
    }
}
