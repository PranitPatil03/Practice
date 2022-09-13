package com.company.Graphs.Theory.Depth_First_Search;

import java.util.ArrayList;

public class DFS1 {
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,3,4);

        printGraph(adj);
        System.out.println("");
        dfs(adj,0,v);
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

    static void dfs(ArrayList<ArrayList<Integer>>adj,int s,int v){
        boolean[] visited=new boolean[v+1];
        dfsRec(adj,s,visited);
    }

    static void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s]=true;
        System.out.print(s+" ");

        for(int u: adj.get(s)) {
           if(!visited[u]){
               dfsRec(adj, u, visited);
           }
        }
    }
}
