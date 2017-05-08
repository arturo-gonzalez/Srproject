package com.arigon.srproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferny on 3/25/2017.
 */

public class StateTree {
    public StateTreeNode root;

    //constructor for the tree, creates a root with given data
    public StateTree(BoardState rootData, int inPlayer){
        root = new StateTreeNode(rootData, inPlayer);
    }


    public static class StateTreeNode{

        //BoardState is an object that contains a 2D array with the board
        //and a 1D array for the numberboard
        public BoardState game;
        public int player;
        public StateTreeNode parent;
        public ArrayList<StateTreeNode> children;
        public int visits;
        public double score;
        public int vertLastAction;
        public int horizLastAction;
        public String numLastAction;

        //constructor for node, sets up the data
        public StateTreeNode(BoardState data, int inPlayer)
        {
            game = data;
            player = inPlayer;
            parent = null;
            children = new ArrayList<StateTreeNode>();
            visits = 0;
            score = 0;
        }
    }
}