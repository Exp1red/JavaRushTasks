package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        char[] simvoli = string.toCharArray();
        for (int i = 0 ; i < simvoli.length; i++){
            if (simvoli[0] != ' '){
                simvoli[0] = Character.toUpperCase(simvoli[0]);
            }
            if (simvoli[i] == ' ' && simvoli[i+1] != ' ' ){
                simvoli[i+1] = Character.toUpperCase(simvoli[i+1]);
            }
        }
        String str = new String(simvoli);
        System.out.println(str);
        }
}
