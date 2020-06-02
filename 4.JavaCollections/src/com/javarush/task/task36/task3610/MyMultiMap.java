package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return values().size();
    }

    @Override
    public V put(K key, V value) {
        if (map.containsKey(key)){
            List<V> list = map.get(key);
            V lastValue = list.get(list.size() - 1);
            if (list.size() < repeatCount){
                list.add(value);
            }else  if (list.size() == repeatCount){
                list.remove(0);
                list.add(value);
            }
            map.put(key , list);
            return lastValue;

        }
        List <V> list = new ArrayList<>();
        list.add(value);
        map.put(key , list );
        return null;
    }

    @Override
    public V remove(Object key) {
        if (map.containsKey(key)){
            List<V> list = map.get(key);
            V value = list.get(0);
            list.remove(0);
            if (list.isEmpty()){
                map.remove(key);
            }else {
                map.put((K) key, list);
            }
            return value;
        }else {
            return null;
        }
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        List <V> list = new ArrayList<>();
        for (List<V> list1 : map.values()){
            list.addAll(list1);
        }
        return  list;
//        return  Stream.of(map.values())
//               .flatMap(Stream::of)
//                      .collect(Collectors.toCollection(ArrayList::new));
//
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}