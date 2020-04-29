package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/*
Почитать в инете про медиану выборки
*/
public class Solution  {

    public static void main(String[] args) {
//        Integer[] array = new Integer[]{1,2,3,4};
//        System.out.println(Arrays.toString(sort(array)));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        int median ;
                if (array.length % 2 == 0){
                    median = ((array[array.length/2]) + (array[array.length/2] - 1)) / 2;
                }else {
                    median = (int) Math.ceil( array[array.length / 2  ]);
                }
//        Arrays.sort(array, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Math.abs(median - o1) - Math.abs(median - o2);
//            }
//        });
//        --------------------->
//        Arrays.sort(array, (o1, o2) -> Math.abs(median - o1) - Math.abs(median - o2));
//        ----------------------->
        Arrays.sort(array, Comparator.comparingInt(o -> Math.abs(median - o)));
        return array;
    }


}
