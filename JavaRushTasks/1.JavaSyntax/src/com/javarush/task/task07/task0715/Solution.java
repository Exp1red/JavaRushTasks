package com.javarush.task.task07.task0715;




import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "мама");
        list.add(1, "мыла");
        list.add(2, "раму");
        for (int i = 1; i < list.size()+1; i++) {
            list.add(i, "именно");
            i++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
