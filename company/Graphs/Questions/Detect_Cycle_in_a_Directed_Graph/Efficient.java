package com.company.Graphs.Questions.Detect_Cycle_in_a_Directed_Graph;

import java.util.ArrayList;

public class Efficient {
    public static void main(String[] args) {
        int v=6;
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
        boolean[] stack=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if(dfsRec(adj,i,visited,stack)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited,boolean[] stack) {
        visited[s]=true;
        stack[s]=true;

        for(int u: adj.get(s)) {
            if(!visited[u] &&  dfsRec(adj, u, visited,stack)){
               return true;
            }else if(stack[u]) {
                return true;
            }
        }
        stack[s]=false;
        return false;
    }
}
