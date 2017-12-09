package Graph;

public class LinkedListGraph {

    private int i;
    private String directed;

    Vertex[] arrayOfLists;
    int indexCounter = 0;
    boolean undirected = true;

    public LinkedListGraph(int i, String directed) {
        this.i = i;
        this.directed = directed;
    }

    class Node {
        public int vertexId;
        public Node next;
        public Node(int vertexId, Node node) {
            this.vertexId = vertexId;
            next = node;
        }
    }

    class Vertex {
        String name;
        Node adjacentList;
        Vertex(String name, Node aNode) {
            this.name = name;
            this.adjacentList = aNode;
        }
    }

    public void addVertex(String vertexName) {
        arrayOfLists[indexCounter] = new Vertex(vertexName, null);
        indexCounter++;
    }

    void indexForName(String name) {
        for (int i = 0; i < arrayOfLists.length; i++) {
            System.out.println(i);
        }
    }
}
