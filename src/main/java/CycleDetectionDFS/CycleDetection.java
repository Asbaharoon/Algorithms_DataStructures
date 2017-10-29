package CycleDetectionDFS;

import java.util.*;

public class CycleDetection {

    public void detectCycle(List<Vertex> vertexList) {
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex) {

        System.out.println("DFS on Vertex: " + vertex);
        vertex.setBeingVisited(true);

        for (Vertex v : vertex. getAdjacenciesList()) {

            System.out.println("Visting the neighbors of vertex " + vertex);
            if (v.isBeingVisited()) {
                System.out.println("There is a backward edge: so there's a Cycle!");
                return;
            }

            if (!v.isVisited()) {
                System.out.println("Visiting Vertex "+v+" recursively...");
                v.setVisited(true);
                dfs(v);
            }
        }

        System.out.println("Set vertex "+vertex+" setBeingVisited(false) and visited(true)...");
        vertex.setBeingVisited(false);
        vertex.setVisited(true);
    }
}
