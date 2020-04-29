package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Евdfген", "Путен");
        map.put("Николя", "Мутен");
        map.put("Михаfdен", "Кутен");
        map.put("Слаdfвен", "Рутен");
        map.put("Санgен", "Генен");
        map.put("Санhhен", "Протен");
        map.put("Михаен", "Генен");
        map.put("Славен", "Протен");
        map.put("Евjkhген", "Рутен");
        map.put("Евген", "Кутен");
        return  map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
       Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String,String> pair = iterator.next();
           String value = pair.getValue();
           if (value.equals(name)){
               count++;
           }
       }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {


    }
}
