package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        char[] sToArray = s.toCharArray();
        for (int i = 0; i < sToArray.length; i++){
            if( (sToArray[i]%2) == 0 && sToArray[i] != 0){
                even += 1;
            }else if ((sToArray[i]%2) != 0 && sToArray[i] !=0) {
                odd += 1;
            }else {

            }
        }
        System.out.println("Even: "+ even +" Odd: "+odd);
    }
}

