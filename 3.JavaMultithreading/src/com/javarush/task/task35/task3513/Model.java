package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model(){
        resetGameTiles();
    }

    void resetGameTiles(){
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private void addTile(){
        List<Tile> list = getEmptyTiles();
            if (!list.isEmpty()) {
                Tile tile = list.get((int) (list.size() * Math.random()));
                tile.value = (Math.random() < 0.9) ? 2 : 4;
            }
    }

    private List<Tile> getEmptyTiles (){

        return Arrays.stream(gameTiles)
                .flatMap(Arrays::stream)
                .filter(x -> (x.value == 0))
                .collect(Collectors.toList());
    }
}
