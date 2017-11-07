package DataStructures.LinkedLists.SinglyLinkedList;

public class LinkedListNode {

    LinkedListNode next;
    int data;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class LinkedList {
    LinkedListNode head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        LinkedListNode newHead = new LinkedListNode(data);
        newHead.next = head;
        head = newHead; // Change the 'head' pointer to the newHead, which gets put at the beginning
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next; // Pointing head to the next value, This deletes 'head' essentially
            //                  The node is never explicitly destroyed, but no one can access it so it's eseentially gone
            return;
        }

        LinkedListNode current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // If the next value is the one to delete,
                //                                  walk AROUND and it go to the next
                return;
            }
            current = current.next;
        }
    }
}
