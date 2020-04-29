package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line  =   fileScanner.nextLine();
            String[] personData = line.split(" ", 4);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String firstName = personData[1];
            String middleName = personData[2];
            String lastName = personData [0];
            String date = personData[3];
            Date birthDate = simpleDateFormat.parse(date);
            return new Person(firstName , middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
