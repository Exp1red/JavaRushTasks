package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    abstract class StringObject implements SimpleObject<String>//допишите здесь ваш код
    {
    }
}