package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String color, address, name;
    int age, weight;

    public void initialize(String name){
        this.name = name;
        this.color = "dsfad";
        this.age = 10;
        this.weight = 5;
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "sdasa";
        this.address = null;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "fgdfd";
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 7;
        this.address = null;
        this.name = null;
    }

    public void initialize(int weight, String color, String address){
        this.weight =weight;
        this.color=color;
        this.address = address;
        this.age = 8;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}







/*
7. У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.

 */