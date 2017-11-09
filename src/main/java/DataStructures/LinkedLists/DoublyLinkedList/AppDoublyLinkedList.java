package DataStructures.LinkedLists.DoublyLinkedList;

public class AppDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);
        list.insertLast(99);
        list.insertLast(88);
        list.insertLast(9779);
        list.displayForwards();
        list.displayBackwards();
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(99);
        list.displayForwards();
        list.insertAfter(33, 777);
        list.insertAfter(88, 888);
        list.displayBackwards();
    }
}
