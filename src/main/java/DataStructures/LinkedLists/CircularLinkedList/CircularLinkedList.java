package DataStructures.LinkedLists.CircularLinkedList;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first; // newNode assigned to the Old First
        first = newNode; // Assigning this class's LinkedList first to the new Node created
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; // The old Last points to the New Node created/inserted
            last = newNode; // Make the New Node Created to be the last one in the list
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        }

        first = first.next; // First points to Old First's next value, e.g. The next Node in the List
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return (first == null);
    }
}
