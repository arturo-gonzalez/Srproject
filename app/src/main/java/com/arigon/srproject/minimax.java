package com.arigon.srproject;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by art on 3/24/2017.
 */




public class minimax {

    public void createTree(BoardState currboard)
    {
        //create a new BoardState type node
        NaryTreeNode<BoardState> root = new NaryTreeNode<BoardState>(currboard);

        // Create a tree, providing the root node
        NaryTree<BoardState> tree = new NaryTree<>(root);
    }

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
    List<BoardState>  successors(BoardState state)
    {
        List<BoardState> list = new ArrayList<>();

        //create a tree with all the successors from the given state
        createTree(state);

        //todo: get successors


        //return array of successors
        return list;
    }

}
