package DataStructures.StackAndQueue;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.numberOfItems = 0;
    }

    public void insert(long num) {

        if (rear == maxSize - 1) { //todo If Rear == the last Index (element of the array), set rear to -1, so then rear++ brings it up to 0
            rear = -1;
        }

        rear++;
        queueArray[rear] = num;
        numberOfItems++;
    }

    public long remove() { //todo Remove item from the front of the Queue
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0; //todo Set 'front' back to the 0th index so we can use the array again
        }
        numberOfItems--;
        return temp;
    }

    public long peakFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        };
        System.out.print("]");
    }
}
