package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;


public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

private void createGame(){

    for (int i = 0; i < gameField.length; i++) {
        for (int j = 0; j < gameField[i].length; j++) {
            gameField[i][j] = new GameObject(3, 3);
        }
    }
    for (GameObject[] item : gameField) {
        for (GameObject item1 : item) {
            setCellColor(4, 4 , Color.BLUE);
        }
    }
}

@Override
public void initialize(){
    setScreenSize(SIDE , SIDE);
    createGame();
}

}


/*

3. В методе createGame() нужно заполнить все ячейки массива gameField новыми объектами типа GameObject с соответствующими координатами x и y.
4. В методе createGame() для каждой ячейки массива gameField нужно вызвать метод setCellColor(int, int, Color) с параметрами: координаты x и y, а также любой цвет (например, Color.ORANGE).

 */