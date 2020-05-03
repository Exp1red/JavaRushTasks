package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

import static java.lang.String.valueOf;


public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

     Entry<String> root;

    private   List<Entry<String>> list = new LinkedList<>();
    private   int size = list.size();

    public CustomTree(){
        root = new Entry<>("0");
        list.add(root);
    }



    static class Entry<T> implements Serializable{
        String elementName;
        boolean availableToAddLeftChildren , availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String str) {
            elementName = str;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren () {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }



    }


    public String getParent (String s) {
        for (Entry<String> entry : list ){
            if (entry.elementName.equals(s)){
                return entry.parent.elementName;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if (o.getClass().getSimpleName().equals("String")){

            for (Entry<String> entry : list){
                if (entry.leftChild.elementName.equals(o)){
                    entry.availableToAddLeftChildren = true;
                    entry.leftChild.parent = null;
                    return true;
                }

                if (entry.rightChild.elementName.equals(o)){
                    entry.availableToAddRightChildren = true;
                    entry.rightChild.parent = null;
                    return true;
                }
            }

        }else throw new UnsupportedOperationException();
        return false;
    }

    @Override
    public boolean add(String s){

    for (Entry<String> entry : list) {
        if (entry.isAvailableToAddChildren()) {
            if (entry.availableToAddLeftChildren) {
                Entry<String> leftChild = new Entry<>(s);
                entry.leftChild = leftChild;
                entry.availableToAddLeftChildren = false;
                leftChild.parent = entry;
                list.add(leftChild);
                return true;
            } else {
                Entry<String> rightChild = new Entry<>(s);
                entry.rightChild = rightChild;
                entry.availableToAddRightChildren = false;
                rightChild.parent = entry;
                list.add(rightChild);
                return true;
            }
        }

    }
        return false;
    }


    @Override
    public int size() {
        return list.size() - 1;
    }


    public String get(int index) { throw new UnsupportedOperationException(); }
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }

    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }



}
