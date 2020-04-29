package com.javarush.task.task05.task0521;

/* 
Вызов конструктора из конструктора
*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
       this(x, y, 10.0);

        this.x = x;
        this.y = y;





    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
 /*
 В теле конструктора Circle(double x, double y) надо вызвать конструктор Circle(double x, double y, double radius), передав в него уже имеющиеся х и у и добавить радиус как 10. Вызвать конструктор можно как показано в условии через ключевое слово this.
  */