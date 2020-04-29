package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/


    public class Cat {
        String color, address, name;
        int age, weight;

        public Cat(String name){
            this.name = name;
            this.color = "dsfad";
            this.age = 10;
            this.weight = 5;
            this.address = null;
        }

        public Cat(String name, int weight, int age){
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "sdasa";
            this.address = null;
        }

        public Cat(String name, int age){
            this.name = name;
            this.age = age;
            this.weight = 5;
            this.color = "fgdfd";
            this.address = null;
        }

        public Cat(int weight, String color){
            this.weight = weight;
            this.color = color;
            this.age = 7;
            this.address = null;
            this.name = null;
        }

        public Cat(int weight, String color, String address){
            this.weight =weight;
            this.color=color;
            this.address = address;
            this.age = 8;
            this.name = null;
        }

    public static void main(String[] args) {

    }
}
