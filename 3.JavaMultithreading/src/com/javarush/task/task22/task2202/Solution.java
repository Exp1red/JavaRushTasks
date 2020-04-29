package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String result = "";
        List<String> strings ;
        if (string == null){
            throw new TooShortStringException();
        }else {
             strings = Arrays.asList(string.split(" "));
        }
        if (strings.size() < 5 ) {
            throw new TooShortStringException();
        }else {
            for (int i = 1; i <= 4; i++) {
                result += strings.get(i) + " ";
            }
        }
        return result.substring(0 , result.length() -1 );
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
