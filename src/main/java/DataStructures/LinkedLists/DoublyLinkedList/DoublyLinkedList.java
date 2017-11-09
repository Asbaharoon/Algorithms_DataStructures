package DataStructures.LinkedLists.DoublyLinkedList;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data; // Adding the data to the New Node created

        if (isEmpty()) {
            last = newNode; // If the List is empty, last will refer to the new node created
        } else {
            first.previous = newNode;
        }

        newNode.next = first; // newNode next's field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; // Assigning old 'last' to newNode
            newNode.previous = last; // The old 'last' will point to newNode.previous
        }

        last = newNode;
    }

    // Assume it is a Non-Empty List
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // Only one item in the list if first.next points to null
            last = null;
        } else {
            first.next.previous = null; // the List's first Node will point to null, first.next points to the 2nd Node
        }

        first = first.next; // Assigning the reference of the node following the old first node(first.next) to the first field (first) in the linkedList Object
        return temp; // Return the deleted old first Node
    }

    // Assume it is a Non-Empty List
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) { // only have one node in the list
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
    }

    // Assume it is a Non-Empty List
    public boolean insertAfter(int key, int data) {
        Node current = first; // Start from beginning of the list
        while (current.data != key) { // While we have not found the key in a particular Node
            current = current.next; // Progress through the List
            if (current == null) { // Reached End of List, Not able to find the Key being searched for
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next; // When we insert between 2 Nodes, we need the newNode.next pointing to the Current Node.Next so we don't lose that Node
            current.next.previous = newNode;
        }
// current gets traversed by current = current.next, keep going down the list until we find the Key searched for
        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    // Assume a Non-Empty List
    public Node deleteKey(int key) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next; // As we are deleting the matching Key, first now points to current.next, as current is being deleted
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous; // when current is deleted, last now needs to point to current.previous
        } else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForwards() {
        System.out.println("List (First ---> Last): ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next; // Move onto the Next Node in the List
        }
        System.out.println();
    }

    public void displayBackwards() {
        System.out.println("List (Last ---> First): ");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return first == null;
    }

}
