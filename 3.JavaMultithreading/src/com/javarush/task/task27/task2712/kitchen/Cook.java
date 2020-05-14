package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.lang.reflect.InvocationTargetException;
import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable  implements Observer  {
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable observable,  Object arg) {
        try {
            ConsoleHelper.writeMessage("Start cooking - " + arg + " cooking time "+ arg.getClass().getMethod("getTotalCookingTime" ).invoke(arg) +"min");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        setChanged();
       notifyObservers(arg);
    }


}
