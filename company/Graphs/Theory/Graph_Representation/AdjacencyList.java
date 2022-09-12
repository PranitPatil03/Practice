package com.company.Graphs.Theory.Graph_Representation;

import java.util.ArrayList;

/*AdjacencyList
Graph can be represented by the list using Linked List or Dynamic Arrays
Memory used ==> O(V+E)
*/

public class AdjacencyList {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);

        printGraph(adj);

    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){

        adj.get(u).add(v);
        adj.get(v).add(u);

    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (ArrayList<Integer> list : adj) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
