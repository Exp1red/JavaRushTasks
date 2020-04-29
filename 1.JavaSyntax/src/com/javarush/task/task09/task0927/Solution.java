package com.javarush.task.task09.task0927;

import com.sun.javafx.collections.MappingChange;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> cats  = new HashMap<>();
        cats.put("safasdf" , new Cat("cat1"));
        cats.put("safassf" , new Cat("cat2"));
        cats.put("safassdf" , new Cat("cat3"));
        cats.put("safasfdf" , new Cat("cat4"));
        cats.put("safafsdf" , new Cat("cat5"));
        cats.put("safasdsdf" , new Cat("cat6"));
        cats.put("safsdasdsdf" , new Cat("cat7"));
        cats.put("safsdasdf" , new Cat("cat8"));
        cats.put("safsdasddf" , new Cat("cat9"));
        cats.put("safsdassdf" , new Cat("cat10"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> list = new HashSet<>(map.values());
        return list;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
