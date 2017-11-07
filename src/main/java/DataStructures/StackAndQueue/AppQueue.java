package DataStructures.StackAndQueue;

public class AppQueue {

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(10);
        myQueue.insert(230);
        myQueue.insert(122);
        myQueue.insert(414);
        myQueue.insert(910);
        myQueue.insert(1110);

        myQueue.view();
    }
}
