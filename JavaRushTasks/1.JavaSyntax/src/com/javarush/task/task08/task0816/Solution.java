package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("dsfdfdf" , dateFormat.parse("JUNE 4 2000" ));
        map.put("Сталлонеf", dateFormat.parse("MAY 1 2012"));
        map.put("dsfjdfdf" , dateFormat.parse("AUGUST 4 2000" ));
        map.put("Сталлонaе", dateFormat.parse("MAY 1 2012"));
        map.put("dsfdhfdf" , dateFormat.parse("JULY 4 2000" ));
        map.put("Сталлdоне", dateFormat.parse("JANUARY 1 2012"));
        map.put("dsfdfdgf" , dateFormat.parse("DECEMBER 4 2000" ));
        map.put("Ста2ллоне", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("dsfsdfdf" , dateFormat.parse("OCTOBER 4 2000" ));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() > 4 && value.getMonth() < 8){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
