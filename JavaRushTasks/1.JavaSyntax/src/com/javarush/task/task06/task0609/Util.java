package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {

        double distance ;
        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1 , 2));
        return distance;


    }

/*
AB = √(x2 - x1)2 + (y2 - y1)2
 */

    public static void main(String[] args) {

    }
}
