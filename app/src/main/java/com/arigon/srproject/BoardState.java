package com.arigon.srproject;

import android.widget.Button;

import java.util.List;

/**
 * Created by Ferny on 3/25/2017.
 */

public class BoardState {
    public SquareButton[][] curBoard;
    public List<Button> curNumbers;

    BoardState(SquareButton[][] inboard, List<Button> innumbers)
    {
        curBoard = inboard;
        curNumbers = innumbers;
    }

}
