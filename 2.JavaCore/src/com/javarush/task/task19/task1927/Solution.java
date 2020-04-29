package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
В методе main подмени объект System.out написанной тобой реадер-оберткой.
Твоя реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Рекламный текст: "JavaRush - курсы Java онлайн"
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        String context = "JavaRush - курсы Java онлайн";
        testString.printSomething();



        System.setOut(consoleStream);
        String[] string = outputStream.toString().split(System.lineSeparator());
        int i = 0;
        for (String sti : string) { // пока есть строки, что загнаны в наш массив
            System.out.println(sti); // выводим первую строку
            i++; // считаем счетчик второй строки
            if  ((i % 2) == 0) { // если строка третья, то выводим в консоль рекламу
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
