package com.javarush.task.task35.task3504;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* 
Простой generics
*/
public class Solution<T extends HashMap > {
    private HashMap map;

    public Solution(HashMap map) {
        this.map = map;
    }

    public HashMap getMap() throws NoSuchFieldException {
//        Field stringListField = Solution.class.getDeclaredField("map");
//        ParameterizedType stringListType = (ParameterizedType) stringListField.getGenericType();
//        Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
        return map;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("string", 4);
        Solution solution = new Solution(hashMap);
        HashMap mapFromSolution = solution.getMap();
        System.out.println(mapFromSolution.getClass());


        LinkedHashMap<Solution, Solution> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(solution, solution);
        Solution solution2 = new Solution(hashMap2);
        LinkedHashMap mapFromSolution2 = (LinkedHashMap) solution2.getMap();   //need to cast  :(
        System.out.println(mapFromSolution2.getClass());
    }
}
