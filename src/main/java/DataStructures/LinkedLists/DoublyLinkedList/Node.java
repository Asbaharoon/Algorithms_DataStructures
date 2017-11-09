package DataStructures.LinkedLists.DoublyLinkedList;

public class Node {

    int data;
    public Node next;
    public Node previous;

    public Node(int data) {}

    public Node() {}

    public void displayNode() {
        System.out.println("{ " + data + " } ");
    }
}
