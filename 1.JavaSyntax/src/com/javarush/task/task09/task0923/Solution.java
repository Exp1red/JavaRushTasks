package com.javarush.task.task09.task0923;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> notVowels = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char [] chars = string.toCharArray();
        for (int i = 0; i<chars.length; i++){
           if (isVowel(chars[i])) {
               vowels.add(chars[i]);
           }else if (!isVowel(chars[i]) && chars[i] != ' '){
               notVowels.add(chars[i]);
           }
        }
        for (Character ch : vowels){
            System.out.print(ch+" ");
        }
        System.out.println();
        for (Character ch : notVowels){
            System.out.print(ch+" ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}