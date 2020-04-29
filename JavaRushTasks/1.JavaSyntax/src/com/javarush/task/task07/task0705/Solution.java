package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(reader.readLine());
            if (i<10) {
                arr1[i] = arr[i];
            }
        }
        System.arraycopy(arr, 10 , arr2 ,0 , 10 );
        for (int i = 0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
}
 /*
 Метод System.arraycopy() принимает несколько параметров.

Первым параметром является массив-источник.
Вторым параметром является позиция начала нового массива.
Третий параметр — массив-назначения.
Четвертый параметр является начальным положением целевого массива.
Последний параметр это количество элементов, которые будут скопированы.
  */