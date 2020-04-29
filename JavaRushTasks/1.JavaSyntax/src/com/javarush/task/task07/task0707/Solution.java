package com.javarush.task.task07.task0707;


import java.io.IOException;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();


        list.add(0, "seda");
        list.add(1, "veda");
        list.add(2, "neda");
        list.add(3, "geda");
        list.add(4, "jeda");


        int n = list.size();
        System.out.println(n);

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
