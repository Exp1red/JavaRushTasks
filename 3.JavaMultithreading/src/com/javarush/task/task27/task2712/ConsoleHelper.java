package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)  {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage("Choose and enter a dish or press 'exit' for end your order");
        ConsoleHelper.writeMessage( Dish.allDishesToString());
        List<String> dishes = new ArrayList<>();
        List<Dish> listOfOrder = new ArrayList<>();

        for (int i = 0 ; i < Dish.values().length ; i++){
            dishes.add(Dish.values()[i].toString());
        }


        while (true) {
            String choose = readString();
                if (choose.equals("exit")){
                    break;
                }
            if (dishes.contains(choose)){
                listOfOrder.add(Dish.valueOf(choose));
            }else {
            writeMessage("please choose available dish");
            }
        }
        return listOfOrder;
    }
}
