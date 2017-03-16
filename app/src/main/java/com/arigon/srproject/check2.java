package com.arigon.srproject;
/**
 * Created by Ferny on 3/15/2017.
 */

import android.widget.TextView;

public class check2{
    ///////////////////////////////////////////////////////////////////
    //checkIfValid checks if it is ok to place a number in a given spot
    //return true if its ok to place the number
    //return false if not
    ///////////////////////////////////////////////////////////////////
    public Boolean checkIfValid(SquareButton button, SquareButton[][] boardButtons, String value) {
        int row = button.row;
        int column = button.column;
        //check above
        if(row - 2 >= 0 && boardButtons[row - 2][column].getText().toString().length() > 0) {
            if(boardButtons[row - 1][column].getText() == "<" && Integer.parseInt(boardButtons[row-2][column].getText().toString()) >= Integer.parseInt(value)
                    || boardButtons[row - 1][column].getText() == ">" && Integer.parseInt(boardButtons[row-2][column].getText().toString()) <= Integer.parseInt(value)) {
                return false;
            }
        }
        //check to the left
        if(column - 2 >= 0 && boardButtons[row][column - 2].getText().toString().length() > 0){
            if(boardButtons[row][column - 1].getText() == "<" && Integer.parseInt(boardButtons[row][column - 2].getText().toString()) >= Integer.parseInt(value)
                    || boardButtons[row][column - 1].getText() == ">" && Integer.parseInt(boardButtons[row][column - 2].getText().toString()) <= Integer.parseInt(value)) {
                return false;
            }
        }
        //check below
        if(row + 2 < boardButtons.length && boardButtons[row + 2][column].getText().toString().length() > 0){
            if(boardButtons[row + 1][column].getText() == "<" && Integer.parseInt(boardButtons[row + 2][column].getText().toString()) <= Integer.parseInt(value)
                    || boardButtons[row + 1][column].getText() == ">" && Integer.parseInt(boardButtons[row + 2][column].getText().toString()) >= Integer.parseInt(value)) {
                return false;
            }
        }
        //check to the right
        if(column + 2 < boardButtons[row].length && boardButtons[row][column + 2].getText().toString().length() > 0){
            if(boardButtons[row][column + 1].getText() == "<" && Integer.parseInt(boardButtons[row][column + 2].getText().toString()) <= Integer.parseInt(value)
                    || boardButtons[row][column + 1].getText() == ">" && Integer.parseInt(boardButtons[row][column + 2].getText().toString()) >= Integer.parseInt(value)) {
                return false;
            }
        }
        return true;
    }
}
