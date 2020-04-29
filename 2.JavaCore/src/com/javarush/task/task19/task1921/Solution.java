package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        while (bufferedReader.ready()){
            String[] components = bufferedReader.readLine().split(" ");
            String day =  components[components.length-3];
            String month =  components[components.length-2];
            String year =  components[components.length-1];
            components[components.length-1] = "";
            components[components.length-2] = "";
            components[components.length-3] = "";
            String name = components[0] ;
            for (int i = 1 ; i < components.length; i++){
                name = name+" "+components[i];
            }
            name =  name.substring(0, name.length()-3);
            String date = day+" "+month+" "+year;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            Date birthDate = simpleDateFormat.parse(date);
            PEOPLE.add(new Person(name , birthDate));

        }
        bufferedReader.close();
//        String[] strings = "Иванов Иван Иванович 31 12 1987".split(" ");
//        strings[strings.length-1] = "";
//        strings[strings.length-2] = "";
//        strings[strings.length-3] = "";
//        String name = strings[0];
//        for (int i = 1; i < strings.length ; i++) {
//            name = name + " " + strings[i];
//        }
//        name =  name.substring(0, name.length()-3);
//        System.out.println(name);
    }
}
