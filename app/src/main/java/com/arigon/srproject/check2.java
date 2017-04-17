package com.arigon.srproject;
/**
 * Created by Ferny on 3/15/2017.
 */

import android.widget.Button;
import android.widget.TextView;

import java.util.List;

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

    //for each button check if one of the available numberes can be placed on it
    public Boolean checkAvailable(int lsize, int wsize,SquareButton[][] boardButtons, List<Button> availableButtons) {
        for(int i = 0;i<lsize;i++)
        {
            for(int j = 0; j<wsize;j++)
            {
                int row = i;
                int column = j;

                for(int k = 0; k<availableButtons.size();k++)
                {
                    String value = availableButtons.get(k).getText().toString();
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
                }
                return true;
            }
        }
        return true;
    }

    public Boolean checkAvailable2(SquareButton button,SquareButton[][] boardButtons, List<Button> availableButtons)
    {
        for(int k = 0; k<availableButtons.size();k++)
        {
            if(checkIfValid(button, boardButtons, availableButtons.get(k).getText().toString()))
                return true;
        }
        return false;
    }
}
