package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        ArrayList<Byte> list = new ArrayList<>();
        while (fileReader.available() > 0){
            list.add((byte) fileReader.read());
        }
        fileReader.close();
        Set<Byte> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);
        for (Byte number : list){
            System.out.print(number+" ");
        }
    }
}
