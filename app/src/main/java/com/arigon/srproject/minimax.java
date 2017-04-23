package com.arigon.srproject;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by art on 3/24/2017.
 */




public class minimax {

    ////////////////////////////////////////////////////////////////
    //AI//
    //////////////////////////////////////////////////////////////
    BoardState minimax(BoardState state, int depth)
    {
        //todo:minimax
        return state;//should return the best move

    }


    int minValue(BoardState state, int depth)
    {
        if(depth == 0)
        {

        }
        int v = 1000;
        for(BoardState s : successors(state))
        {
            v = min(v, maxValue(s, depth-1));

        }
        return v;
    }

    int  maxValue(BoardState state, int depth)
    {
        if(depth==0)
        {
            //return best option once the tree hs been traversed
        }
        int v = -1000;
        for(BoardState s : successors(state))
        {
            v = max(v, minValue(s,depth-1));

        }
        return v;
    }

    //return each possible state reachable from a given state
    BoardState[]  successors(BoardState state)//todo: reachable states from any state
    {
        BoardState[] states = new BoardState[5];//5 is just a place holder, it should be the number of states


        return states;//return array of states
    }

}
