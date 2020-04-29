package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int l = 0;
        for (int i = 0; i<N ; i++) {
            list.add(i, reader.readLine());
        }
        while (l < M){
            list.add(list.remove(0));
            l++;
        }
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
