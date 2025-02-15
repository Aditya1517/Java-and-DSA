package Graphs;

import java.util.ArrayList;

public class cycleDetecion {
    static class Edge {
        int src;
        int dest;
        
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }


    // for undirected graph
    public static boolean detecCycle(ArrayList<Edge> [] graph){
        boolean visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(detecCycleUtil(graph,visited,i,-1)){
                    return true;
                    // means cycle exists in one of the part
                }
            }
        }
        
        return false;
    }

    public static boolean detecCycleUtil(ArrayList<Edge> [] graph,boolean visited[],int curr,int parent){
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            // case 3
            if(!visited[e.dest] ){
                if(detecCycleUtil(graph, visited, e.dest, curr)){
                    return true;
                }
                
            }
            // case 1
            else if(visited[e.dest] && e.dest != parent){
                return true;
            }
            // case 2 -> do nothing i.e continue
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];  // null is stored in ArrayList
        // here type of a graph is ArrayList of Edge

        createGraph(graph);

        System.out.println(detecCycle(graph));
        
    }
}
