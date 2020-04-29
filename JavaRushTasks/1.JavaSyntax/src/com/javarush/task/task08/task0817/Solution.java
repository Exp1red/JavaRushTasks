package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("1dfsgfd", "Евгений");
        map.put("2dfg", "Саня");
        map.put("3dfgdf", "Саня");
        map.put("4ghghg", "Евгений");
        map.put("5ghgh", "Вячеслав");
        map.put("6sfdgd", "Энтони");
        map.put("7vdfbdf", "Михаил");
        map.put("8hfghfg", "Костя");
        map.put("9fdgdg", "Михаил");
        map.put("10fdgdfgf", "Евгений");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> dublicates = new ArrayList<>();
        Map<String,String> mapCopy = new HashMap<>(map);
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            String value = pair.getValue();
            for (Map.Entry<String,String> copyPair : mapCopy.entrySet()){
                if (copyPair.getValue().equals(value) && !copyPair.getKey().equals(pair.getKey())){
                    dublicates.add(value);
                    break;
                    }
                }
            }
        for (String value : dublicates){
            removeItemFromMapByValue(map, value);
        }
        }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
