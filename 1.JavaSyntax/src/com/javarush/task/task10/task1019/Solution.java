package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            while (true) {
                try {
                    int id = Integer.parseInt(reader.readLine());
                    String name = reader.readLine();
                    map.put(name, id);
                } catch (NumberFormatException e) {
                    break;
                }
            }


       for ( Map.Entry<String, Integer > pair : map.entrySet()){
           System.out.println(pair.getValue()+" "+pair.getKey());
       }

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
