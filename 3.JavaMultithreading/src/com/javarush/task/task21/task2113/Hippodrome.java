package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private static List<Horse> horses = new ArrayList<>();



    public static void main(String[] args) {
        Horse horse1 = new Horse ("Слава", 3 , 0);
        Horse horse2 = new Horse ("Саша", 3 , 0);
        Horse horse3 = new Horse ("Костя", 3 , 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public Hippodrome (List<Horse> horses){
        this.horses = horses;
    }

    public List<Horse> getHorses (){
        return  horses ;
    }

    public void run(){

        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public void move(){
        for (Horse horse :
                horses) {
            horse.move();
        }
    }

    public void print(){
        for (Horse horse:
             horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner(){
        Horse winner = null;

        List<Double> listOfDistance = new ArrayList<>();

        for (Horse horse :
                horses) {
           listOfDistance.add( horse.getDistance());
        }

        for (Horse horse :
                horses) {
            if (Collections.max(listOfDistance) == horse.getDistance()){
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().name+"!");
    }
}
