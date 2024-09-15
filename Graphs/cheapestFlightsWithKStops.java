package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cheapestFlightsWithKStops {
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

    public static void crateGraph(int flights[][],ArrayList<Edge> garph[]){
        // initialize an empty arrayList
        for(int i=0;i<garph.length;i++){
            garph[i] = new ArrayList<>();
        }

        // loop on flights to create edge
        for(int i=0;i<flights.length;i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);

            // add this info to graph
            garph[src].add(e);
        }
    }

    static class Info{
        int v;  // vertex
        int cost;
        int stops;

        public Info(int v,int c,int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n,int flights[][],int src,int dest,int k){

        ArrayList<Edge> garph[] = new ArrayList[n];

        // creation of graph
        crateGraph(flights, garph);

        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stops>k){
                break;
            }

            for(int i=0;i<garph[curr.v].size();i++){
                Edge e = garph[curr.v].get(i);

                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost+wt<dist[v] && curr.stops <= k){
                    // relaxation step
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));

                }
            }
        }
        // dist[dest]
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n=4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0;
        int dest=3;
        int k=1;

        System.out.println(cheapestFlight(n, flights, src, dest, k));    
    }
}
