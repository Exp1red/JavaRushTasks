package com.javarush.task.task22.task2203;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        List<String> strings ;
        if (string == null) {
            throw new TooShortStringException();
        }else {
            strings = Arrays.asList(string.split("\t"));
        }
        if (strings.size() < 3){
            throw  new TooShortStringException();
        }else {
            return string.substring(string.indexOf("\t")+1, string.indexOf("\t", string.indexOf("\t") + 1));
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
