package DataStructures.LinkedLists.CircularLinkedList;

public class AppCircularLinkedList {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(12);
        circularLinkedList.insertFirst(44);
        circularLinkedList.insertFirst(12);
        circularLinkedList.insertFirst(143);
        circularLinkedList.insertLast(123456);

        circularLinkedList.displayList();
    }
}
