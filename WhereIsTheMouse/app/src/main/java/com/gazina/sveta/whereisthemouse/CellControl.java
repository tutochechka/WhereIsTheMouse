package com.gazina.sveta.whereisthemouse;

import java.util.Random;

/**
 * Created by Sveta on 5/23/2016.
 */
public class CellControl {
    private int size = 5;
    private int gameField [][] = new int[size][size];

    public int[][] getGameField() {
        return gameField;
    }
    public int getRow(int position){
        return position/size;
    }
    public int getColumn(int position){
        return position%size;
    }

    public int getSize() {
        return size;
    }
    public void setNewGame(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameField[i][j] = 0;
            }
        }
        Random rand = new Random();
        int i = rand.nextInt(size);
        int j = rand.nextInt(size);
        gameField[i][j] = 1;

    }
    public int getCellType(int row, int column){

        if(gameField[row][column] == 1){
            return R.drawable.mousefound;
        }

        for (int i = 0; i < row; i++) {
            if (gameField[i][column] == 1){
                return R.drawable.n;
            }
        }
        for (int i = row + 1; i < size; i++) {
            if (gameField[i][column] == 1){
                return R.drawable.s;
            }
        }
        for (int i = 0; i < column; i++) {
            if (gameField[row][i] == 1){
                return R.drawable.w;
            }
        }
        for (int i = column + 1; i < size; i++) {
            if (gameField[row][i] == 1){
                return R.drawable.e;
            }
        }
        int j;

        j = column;
        for (int i = row -1; i >= 0 ; i--) {
            j--;
            if (j >= 0 && gameField[i][j] == 1) {
                return R.drawable.nw;
            }

        }
        j = column;
        for (int i = row + 1; i < size ; i++) {
            j--;
            if (j >= 0 && gameField[i][j] == 1) {
                return R.drawable.sw;
            }

        }

        j = column;
        for (int i = row -1; i >= 0 ; i--) {
            j++;
            if (j < size && gameField[i][j] == 1) {
                return R.drawable.ne;
            }

        }

        j = column;
        for (int i = row + 1; i < size ; i++) {
            j++;
            if (j < size && gameField[i][j] == 1) {
                return R.drawable.se;

            }

        }
        return R.drawable.empty;
    }

}
