package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> child1 = new ArrayList<>();
        ArrayList<Human> child2 = new ArrayList<>();
        ArrayList<Human> kidy1 = new ArrayList<>();
        ArrayList<Human> kidy2 = new ArrayList<>();
        ArrayList<Human> kidy3 = new ArrayList<>();
        Human grandfa1 = new Human ("Саша" , true , 61 , child1);
        Human grandma1 = new Human ("Таня" , false , 60 , child1);
        Human father = new Human ("Дима" , true , 40 , children);
        Human grandfa2 = new Human ("Леонид" , true , 51 , child2 );
        Human grandma2 = new Human ("Надя" , false , 61 ,child2 );
        Human mother = new Human ("Наташа" , false , 39 , children);
        Human kid1 = new Human ("Женя" , true , 20 , kidy1);
        Human kid2 = new Human ("Вика" , false , 15 , kidy2);
        Human kid3 = new Human ("Ксюша" , false , 21  , kidy3);
        children.add(kid1);
        children.add(kid2);
        children.add(kid3);
        child1.add(father);
        child2.add(mother);


        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(grandfa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandfa2.toString());
        System.out.println(grandma2.toString());








    }

    public static class  Human {
        //напишите тут ваш код
        public String name ;
        public boolean sex;
        public int age;
        public ArrayList<Human> children ;






        public Human (String name , boolean sex , int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name , boolean sex , int age , ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }




        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
/*
Создаешь детей, добавляешь их в ArrayList children
Создаешь отца, в конструкторе лист children
Добавляешь в массив father
Создаешь маму, в конструкторе лист children
Добавляешь в массив mother
Дедушке (1) и бабушке (1) в конструктор лист father
Дедушке (2) и бабушке (2) в конструктор лист mother
 */