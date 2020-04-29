package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно.
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла, считать содержимое файла.
3. Заменить все числа на слова используя словарь map.
4. Результат вывести на экран.
5. Закрыть потоки.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0 , "ноль");
        map.put(1 , "один");
        map.put(2 , "два");
        map.put(3 , "три");
        map.put(4 , "четыре");
        map.put(5 , "пять");
        map.put(6 , "шесть");
        map.put(7 , "семь");
        map.put(8 , "восемь");
        map.put(9 , "девять");
        map.put(10 , "десять");
        map.put(11 , "одиннадцать");
        map.put(12 , "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        StringBuilder commonLine = new StringBuilder();
        while (bufferedReader.ready()){
            String[] strings = bufferedReader.readLine().split(" ");
            for (String string : strings){
                if (isNumber(string)){
                    if (Integer.parseInt(string ) >= 0 && Integer.parseInt(string )<=12 ) {
                        for (Map.Entry<Integer, String> pair : map.entrySet()) {
                            if (String.valueOf(pair.getKey()).equals(string)) {
                                commonLine.append(pair.getValue() + " ");
                            }
                        }
                    } else {commonLine.append(string+" ");}
                }else {
                    commonLine.append(string+" ");
                }
            }
            System.out.println(commonLine);
            commonLine.setLength(0);
        }
        bufferedReader.close();
    }
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
//line=line.replaceAll("\\b"+entry.getKey()+"\\b",entry.getValue()); алгоритм замены в 1 строку
//меняем ключ на значение