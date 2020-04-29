package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> map = new HashMap<>();
        map.put("1dfsgfd", "Евгений");
        map.put("2dfg", "Саня");
        map.put("3dfgdf", "Саня");
        map.put("4ghghg", "Евгений");
        map.put("5ghgh", "Вячеслав");
        map.put("1dfsgfd", "Энтони");
        map.put("7vdfbdf", "Михаил");
        map.put("8hfghfg", "Костя");
        map.put("9fdgdg", "Михаил");
        map.put("4ghghg", "Евгений");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
