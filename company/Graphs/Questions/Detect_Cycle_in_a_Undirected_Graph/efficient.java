package com.company.Graphs.Questions.Detect_Cycle_in_a_Undirected_Graph;

import java.util.ArrayList;

public class efficient {
    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,2,3);

        printGraph(adj);
        System.out.println("");
        System.out.println(dfs(adj,v));
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

    static boolean dfs(ArrayList<ArrayList<Integer>>adj,int v){
        boolean[] visited=new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if(dfsRec(adj,i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited,int parent) {
        visited[s]=true;

        for(int u: adj.get(s)) {
            if(!visited[u]){
                if(dfsRec(adj, u, visited,s)){
                    return true;
                }
            }else if(u!=parent){
                return true;
            }
        }
        return false;
    }
}
