package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile1 = new FileInputStream(args[0]);
        ArrayList<Byte> list = new ArrayList<>();
        TreeMap<Byte, Integer> treeMap = new TreeMap<>();
        while (inputFile1.available() > 0) {
            list.add((byte) inputFile1.read());
        }
        inputFile1.close();

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            byte x = list.get(i);
           if (!treeMap.containsKey(x)) {
               treeMap.put(x, count);
           }
        }


            for (Map.Entry<Byte, Integer> pair : treeMap.entrySet()) {
                System.out.println((char)(byte)pair.getKey()+" "+pair.getValue());
            }

    }

}






















//        ArrayList<Integer> listOfRepeat = new ArrayList<>();
//        ArrayList<Byte> list = new ArrayList<>();
//        while(inputFile1.available()>0){
//            list.add((byte)inputFile1.read());
//        }
//        inputFile1.close();
//        Collections.sort(list);
//
//        for (Byte number : list){
//            int count = 0;
//            int index = 0;
//            for ( index = 0 ; index<list.size(); index++){
//                if (number == list.get(index)){
//                    count++;
//                }
//            }
//            listOfRepeat.add(count);
//        }
//
//        Set<Byte> set = new HashSet<>(list);
//        list.addAll(set);
//        for (int i = 0 ; i < set.size(); i++){
//            System.out.println((char)((byte)list.get(i))+" "+listOfRepeat.get(i));
//        }

