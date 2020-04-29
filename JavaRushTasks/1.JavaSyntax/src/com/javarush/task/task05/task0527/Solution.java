package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog pankyDog = new Dog("panky" , 6 , 50);
        Cat tomCat = new Cat("Tom" , 45 , 145 );

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        int strength;

        public Dog(String name , int age , int strength){
            this.name = name ;
            this.age = age;
            this.strength = strength;
        }
    }

    public static class Cat {
        String name;
        int agility;
        int col;

        public Cat (String name , int agility , int col){
            this.name = name ;
            this.agility = agility;
            this.col = col;
        }

    }


}
