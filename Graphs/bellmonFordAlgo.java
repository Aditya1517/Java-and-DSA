package Graphs;

import java.util.*;

public class bellmonFordAlgo {
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

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));


        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmonFord(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];

        for(int i=0;i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // algo
        int V = graph.length;

        // and the bello loop will run for vertices so O(V) and total will be O(V*E)
        for(int i=0;i<V-1;i++){   // this loop is for V-1 iterations
            // edges - O(E)

            // these 2 inner loops will run only for edges so O(E)
            for(int j=0;j<graph.length;j++){  // this loop is for vertices
                for(int k=0;k<graph[j].size();k++){   // this loop is for edges
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation step
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // print all shortes distances
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;

        bellmonFord(graph, src);
    }
}
