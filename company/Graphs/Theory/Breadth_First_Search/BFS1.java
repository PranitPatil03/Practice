package com.company.Graphs.Theory.Breadth_First_Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {
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
        addEdge(adj,3,2);

        printGraph(adj);
        bfs(adj,0,v);

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

    static void bfs(ArrayList<ArrayList<Integer>> adj,int s,int v){
        boolean[] visited =new boolean[v+1];
        Queue<Integer> Q=new LinkedList<>();
        visited[s]=true;
        Q.add(s);

        while (!Q.isEmpty()){
            int u=Q.poll();
            System.out.print(u+" ");
            for (int V :adj.get(u)) {
                if (!visited[V]){
                    visited[V]=true;
                    Q.add(V);
                }
            }
        }
    }

}
