package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    public Cat(){

    }

    protected void finalize(){
        System.out.println("A Cat was destroyed");
    }

}

class Dog {
    public Dog(){

    }

    protected void finalize(){
        System.out.println("A Dog was destroyed");
    }

}
