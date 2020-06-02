package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.FileStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.OurHashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy() , 10000);
        testStrategy(new OurHashMapStorageStrategy() , 10000);
        testStrategy(new FileStorageStrategy() , 1000);
    }

    public static Set<Long> getIds (Shortener shortener , Set <String> strings){
       return strings.stream()
                .map( shortener::getId )
                .collect(Collectors.toSet());
    }

    public static Set<String> getStrings (Shortener shortener , Set <Long> keys){
        return keys.stream()
                .map( shortener :: getString)
                .collect(Collectors.toSet());
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Helper.printMessage(strategy.getClass().getSimpleName());

        Set<String> testSet = new HashSet<>();
        for (int i = 0; i < elementsNumber ; i++){
            testSet.add( Helper.generateRandomString());
        }

        Shortener shortener = new Shortener(strategy);
        Date start = new Date();
        Set<Long> longSet =  getIds(shortener , testSet);
        Date finish = new Date();
        Helper.printMessage(String.valueOf( finish.getTime() - start.getTime()));

        Date start2 = new Date();
        Set<String> resultSet = getStrings(shortener , longSet);
        Date finish2 = new Date();
        Helper.printMessage(String.valueOf(finish2.getTime()- start2.getTime()));

        if (resultSet.containsAll(testSet)){
            Helper.printMessage("Тест пройден.");
        }else
            Helper.printMessage("Тест не пройден.");
    }
}
