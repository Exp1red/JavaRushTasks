package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return  string;
    }

    public static int readInt() throws Exception {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int integer = Integer.parseInt(reader.readLine());
         return  integer;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double doublee = Double.parseDouble(reader.readLine());
        return doublee;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String booleann = reader.readLine();
        return Boolean.parseBoolean(booleann);

    }

    public static void main(String[] args) throws Exception {

    }
}
