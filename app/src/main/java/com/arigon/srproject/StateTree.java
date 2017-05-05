package com.arigon.srproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferny on 3/25/2017.
 */

public class StateTree {
    private StateTreeNode root;

    public StateTree(BoardState rootData){
        root = new StateTreeNode();
        root.board = rootData;
        root.children = new ArrayList<StateTreeNode>();
        root.visits = 0;
        root.score = 0;
    }

    public static class StateTreeNode{
        public BoardState board;
        public StateTreeNode parent;
        public List<StateTreeNode> children;
        public int visits;
        public double score;
    }
}