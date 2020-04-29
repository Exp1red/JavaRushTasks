package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("name", "Ivanov");
//        map.put("country", "Ukraine");
//        map.put("city", "Kiev");
//        map.put(null, null);
//        map.put(null, null);
//        map.put(null, null);
//        map.put(null, null);
//        map.put(null, null);
//
//        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        if (!params.isEmpty()) {
            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (!(pair.getValue() == null) && !(pair.getKey() == null)) {
                    sb.append(pair.getKey() + " = " + "'" + pair.getValue() + "'" + " and ");
                }

            }
            if (sb.toString().isEmpty()){
                return "";
            }else {
                return sb.toString().substring(0, sb.length() - 5);
            }
        }else {
            return "";
        }
    }
}
/*
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
 */