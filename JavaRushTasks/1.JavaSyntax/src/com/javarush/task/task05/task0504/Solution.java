package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
       Cat vaska = new Cat("Васька", 15, 10,23);
       Cat smoki = new Cat("Смоки", 10, 7, 25);
       Cat exp = new Cat("эксп", 7 , 8, 30);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}