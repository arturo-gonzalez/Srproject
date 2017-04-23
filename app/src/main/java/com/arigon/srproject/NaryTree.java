package com.arigon.srproject;

/**
 * Created by art on 4/23/2017.
 */

public class NaryTree<T>{
    private NaryTreeNode<T> root;

    public NaryTree(NaryTreeNode<T> root)
    {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public NaryTreeNode<T> getRoot()
    {
        return root;
    }

    public void setRoot(NaryTreeNode<T> root)
    {
        this.root = root;
    }


}
