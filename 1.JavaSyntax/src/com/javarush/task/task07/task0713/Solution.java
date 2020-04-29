package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> startNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20 ; i++){
            startNumbers.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> div3Numbers = new ArrayList<>();
        ArrayList<Integer> div2Numbers = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (Integer number : startNumbers){
             if (number%2 == 0 && number%3 == 0 ) {
                 div2Numbers.add(number);
                 div3Numbers.add(number);
            }else if (number%2 == 0){
                 div2Numbers.add(number);
            }else if (number%3 == 0 ){
                 div3Numbers.add(number);
            }else{
                 otherNumbers.add(number);
             }
        }

        printList(startNumbers);
      //  System.out.println(" ");
        printList(div3Numbers);
      //  System.out.println(" ");
        printList(div2Numbers);
      //  System.out.println(" ");
        printList(otherNumbers);


    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer number : list){
            System.out.println(number);
        }
    }
}
