package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private String address;
        private int height;
        private int weight;

        public Human(String name , int age,  boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = 50;
            this.weight = 180;
            this.address = null;
        }

        public Human(String name , int age,  boolean sex , int height , int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.address = null;
        }

        public Human(String name , int age,  boolean sex , int height , int weight, String address){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.address = address;
        }

        public Human (boolean sex){
            this.sex = sex;
            this.name = "bomj";
            this.address = null;
            this.weight = 70;
            this.height = 170;
            this.age = 50;
        }

        public Human(){

        }

        public Human(String name , int age,  boolean sex , int height ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = 54;
            this.address = null;
        }

        public Human(String name , int age, int weight){
            this.name = name;
            this.age = age;
            this.sex = true;
            this.height = 160;
            this.weight = weight;
            this.address = null;
        }

        public Human(  boolean sex , int height , int weight){
            this.name = null;
            this.age = 30;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.address = null;
        }

        public Human(String name ,   boolean sex , int height , int weight){
            this.name = name;
            this.age = 20;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.address = null;
        }

        public Human (int height , int weight){
            this.name = null;
            this.age = 20;
            this.sex = false;
            this.height = height;
            this.weight = weight;
            this.address = null;
        }

    }
}
