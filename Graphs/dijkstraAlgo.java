package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstraAlgo {
    static class  Edge {
        int src;
        int dest;
        int wt;
        
        Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }


    static void crateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));


        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        
        Pair(int n,int path){
            this.n = n;  // this node stores index value
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;  // path based sorting for pairs
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[],int src){   // O(V+E(log(v)))
        int dist[] = new int[graph.length];  // dist[i] = src to i distance

        // 1. initialize all values to infinity
        for(int i=0;i<graph.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean visited[] = new boolean[graph.length];

        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        // loop for bfs
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n] = true;
                for(int i=0;i<graph[curr.n].size();i++){
                    // for neighbours
                    Edge e = graph[curr.n].get(i);  // edge
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u]+wt<dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // print all shortest distances
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        crateGraph(graph);

        int src = 0;

        dijkstra(graph, src);
    }
}
