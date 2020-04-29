package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        List<String> list = new ArrayList<>();
        Map<String , String> map = new HashMap<>();

        while (bufferedReader.ready()) {
            list.addAll(Arrays.asList(bufferedReader.readLine().split(" ")));
        }
        bufferedReader.close();

        for (String str : list) {
                for (String str1 : list) {
                    if (!(str == str1)) {
                        if (str.equals(new StringBuilder(str1).reverse().toString())) {
                           if(!map.containsKey(str1) && !map.containsValue(str)) {
                               map.put(str, str1);
                           }
                        }
                    }
                }
        }

        for (Map.Entry<String, String> pair : map.entrySet()){
            Pair pair1 = new Pair();
            pair1.first = pair.getKey();
            pair1.second = pair.getValue();
            result.add(pair1);
        }


    }


    public static class Pair {
        String first;
        String second;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
