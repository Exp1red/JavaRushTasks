package com.javarush.task.task36.task3605;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
             static  int count = 0;
    public static void main(String[] args) throws IOException {
       try ( FileInputStream fileInputStream = new FileInputStream(args[0]))
       {

           TreeSet<Character> set = new TreeSet<>();
           while (fileInputStream.available() >0){
               set.add((char)fileInputStream.read());
           }


           set.stream()
                   .filter(Character::isLetter)
                   .limit(5)
                   .forEach(System.out::print);

       }


    }
}
