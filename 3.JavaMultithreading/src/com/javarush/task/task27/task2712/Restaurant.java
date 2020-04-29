package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;

public class Restaurant {
    public static void main(String[] args) throws IOException {
        Tablet tablet1 = new Tablet(1);
        tablet1.createOrder();
        tablet1.createOrder();
        tablet1.createOrder();
        tablet1.createOrder();
    }
}
