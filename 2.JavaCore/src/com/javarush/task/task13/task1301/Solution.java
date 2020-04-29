package com.javarush.task.task13.task1301;

/* 
Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.

*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic{
        @Override
        public void sleepOnTheFloor() {

        }

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return Alcoholic.READY_TO_GO_HOME;
        }
    }
}