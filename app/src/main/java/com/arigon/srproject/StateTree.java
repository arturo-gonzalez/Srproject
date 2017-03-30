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
        root.data = rootData;
        root.children = new ArrayList<StateTreeNode>();
    }

    public static class StateTreeNode{
        private BoardState data;
        private StateTreeNode parent;
        private List<StateTreeNode> children;
    }
}