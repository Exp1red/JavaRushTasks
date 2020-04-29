package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Byte> list=new ArrayList<>();

        while (fileInputStream.available()>0){
            list.add((byte)fileInputStream.read());
        }
        int count;
        HashMap<Byte ,Integer > map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i),count);
        }

        if(!map.isEmpty()){
            int max = Collections.max(map.values());
            for (Map.Entry<Byte,Integer> pair: map.entrySet()) {
                if(pair.getValue() == max)
                    System.out.print(pair.getKey() + " ");
            }}
        fileInputStream.close();
    }
}