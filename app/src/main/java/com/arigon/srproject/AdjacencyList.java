package com.arigon.srproject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by art on 3/18/2017.
 */

public class AdjacencyList {
    private Map<Integer, List<SquareButton>> Adjacency_List;

    public AdjacencyList(int number_of_vertices)
    {
        Adjacency_List = new HashMap<Integer, List<SquareButton>>();
        for(int i = 1; i<=number_of_vertices; i++)
        {
            Adjacency_List.put(i, new LinkedList<SquareButton>());
        }
    }

    public void setEdge(SquareButton source, SquareButton destination)
    {

        List<SquareButton> slist = Adjacency_List.get(source);
        slist.add(destination);
        List<SquareButton> dlist = Adjacency_List.get(destination);
        dlist.add(source);
    }

    public List<SquareButton> getEdge(SquareButton source)
    {
        return Adjacency_List.get(source);
    }


}
