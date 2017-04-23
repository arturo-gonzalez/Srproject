package com.arigon.srproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by art on 4/23/2017.
 */

public class NaryTreeNode<T> {
    private T data;
    private List<NaryTreeNode<T>> children;
    private NaryTreeNode<T> parent;

    public NaryTreeNode(T data)
    {
        this.data = data;
        this.children = new ArrayList<NaryTreeNode<T>>();
    }

    public NaryTreeNode(NaryTreeNode<T> node)
    {
        this.data = node.getData();
        children = new ArrayList<NaryTreeNode<T>>();
    }

    //add a child
    public void addChild(NaryTreeNode<T> child)
    {
        child.setParent(this);
        children.add(child);
    }

    public T getData()
    {
        return this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public NaryTreeNode<T> getParent()
    {
        return this.parent;
    }

    public void setParent(NaryTreeNode<T> parent)
    {
        this.parent = parent;
    }

    public List<NaryTreeNode<T>> getChildren()
    {
        return this.children;
    }


}
