package Graphs;

import java.util.*;

public class bfsAndDfs {
    static class Edge {
        int src;
        int dest;
        int wt;
        
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // BFS
    public static void bfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[],boolean visited[]) { // O(V + E)
        // this bfs util funciton will us in non connected graphs also
        Queue<Integer> q = new LinkedList<>();
        

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }

    // dfs
    public static void dfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[] , int curr,boolean visited[]){

        System.out.print(curr + " ");

        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]){  // e.dest = neighbour
                dfsUtil(graph, e.dest,visited);
            }
        }

    }

    // hasPath
    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean visited[]){
        if(src == dest){
            return true;
        }

        visited[src] = true;

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);

            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
          Graph representation:
          0 -> 1, 2
          1 -> 0, 3
          2 -> 0, 4
          3 -> 1, 4, 5
          4 -> 2, 3, 5
          5 -> 3, 4, 6
          6 -> 5

             1           1           1
            0-----1-----3-----5-----6
            \   /     / \   / \
            1/     1    1/     1
             2-----4     1

         */

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];  // null is stored in ArrayList
        // here type of a graph is ArrayList of Edge

        createGraph(graph);

        // 2's neighbors
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("2's neighbor: " + e.dest);
        }

        System.out.println("BFS traversal:");
        bfs(graph);

        System.out.println();

        System.out.println("DFS Traversal:");
        dfs(graph);

        System.out.println();

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
