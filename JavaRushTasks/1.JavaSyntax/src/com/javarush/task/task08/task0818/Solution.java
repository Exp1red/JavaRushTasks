package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Иванов" , 400);
        map.put("Петров" , 4600);
        map.put("Сидоров" , 600);
        map.put("Ильин" , 100);
        map.put("Мартюшов" , 300);
        map.put("Казаков" , 700);
        map.put("Коляев" , 1400);
        map.put("Тимошин" , 4500);
        map.put("Смокин" , 200);
        map.put("Хуйкин" , 300);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}