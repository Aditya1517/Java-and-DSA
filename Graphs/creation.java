package Graphs;

import java.util.*;

public class creation {
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

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));
    }

    
    public static void main(String[] args) {
        /*

          (5)               (1)
  0------1------2------4
   \     |      |
  (1)\ (5)| (1) |(2)
     \   |    (3)
     (5) 3------/
        (3)   (1)

        dependancy graph : 
            0 -> {0,1,5}
            1->{1,0,5},{1,2,1},{1,3,3}
            2->{2,1,1},{2,3,1},{2,4,2}
            3->{3,1,3},{3,2,1}
            4->{4,2,2}

         */

        int V = 5;

        ArrayList<Edge> [] graph = new ArrayList[V];  // null is stroed in ArrayList
        // here type of a graph is ArrayList of Edge

        crateGraph(graph);

        // 2's neighbors
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
