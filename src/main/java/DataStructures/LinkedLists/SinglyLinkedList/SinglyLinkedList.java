package DataStructures.LinkedLists.SinglyLinkedList;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    //todo Used to insert at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode; //todo Make first point to the newNode created
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();;
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next; // Continue to loop until 'current.next' is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
