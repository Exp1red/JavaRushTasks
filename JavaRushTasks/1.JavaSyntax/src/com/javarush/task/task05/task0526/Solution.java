package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man ("dsad" , 24 , "asdasdas" );
        Man man2 = new Man ("fgg" ,  54 , "hgghhggh");
        Woman woman1 = new Woman ("dsdssd" , 43 , "lnkgknhg");
        Woman woman2 = new Woman ("nenenen" , 65 , "lppppmklm");
        System.out.println(man1.getInformation());
        System.out.println(man2.getInformation());
        System.out.println(woman1.getInformation());
        System.out.println(woman2.getInformation());



    }

    public static class Man{
        String name ;
        int age ;
        String address;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getInformation() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name ;
        int age ;
        String address;

        public Woman (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;

        }

        public String getInformation() {
            return name + " " + age + " " + address;
        }
    }

}
