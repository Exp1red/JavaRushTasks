package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (){

    }

    public Circle (double x , double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (double x , double y){
        this.x = x;
        this.y = y;
        this.radius = 5;
    }

    public Circle (Circle circle){
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public Circle (double radius){
        this.x = radius;
        this.y = radius;
    }

    public static void main(String[] args) {

    }
}