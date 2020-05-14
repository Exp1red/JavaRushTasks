package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) throws IOException {
        Cook cook = new Cook("Amigo");
        Tablet tablet1 = new Tablet(1);
        tablet1.addObserver(cook);
        cook.addObserver(new Waiter());
        tablet1.createOrder();
        
    }
}
