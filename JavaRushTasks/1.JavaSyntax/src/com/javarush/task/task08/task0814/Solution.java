package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> nums = new HashSet<>();
        for (int i =1 ; i<=20; i++){
            nums.add(i);
        }

        return nums ;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(number -> number > 10);

        return  set;

    }

    public static void main(String[] args) {

    }
}
