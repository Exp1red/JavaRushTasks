package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Машину на СТО не повезем!
Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
Выкинь исключение в случае некорректных данных.

Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.


1. Не забудьте  проинициализируйть wheels. Пока что эта переменная ни на что не ссылается.
2. Если количество колёс не равно 4 - это не машина, кидаем исключение.
3. Добавьте в wheels содержимое массива строк, используя valueOf().
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
           wheels = new ArrayList<>();
           if (loadWheelNamesFromDB().length == 4) {
               wheels.add(Wheel.valueOf(loadWheelNamesFromDB()[0]));
               wheels.add(Wheel.valueOf(loadWheelNamesFromDB()[1]));
               wheels.add(Wheel.valueOf(loadWheelNamesFromDB()[2]));
               wheels.add(Wheel.valueOf(loadWheelNamesFromDB()[3]));
           }else throw new IllegalArgumentException();

        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
