package DataStructures.StackAndQueue;

public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1; //todo The last element in the array, -1 index
    }

    public void push(char letter) throws Exception {
        if (isFull()) {
            System.out.println(" This Stack is full!");
            throw new Exception("This Stack is full!");
        } else {
            top++;
            stackArray[top] = letter;
        }
    }

    public char pop() throws Exception {
        if (isEmpty()) {
            System.out.println(" This Stack is Empty!");
            throw new Exception("This Stack is Empty!");
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top); //todo Index starts from 0, thats why we minus 1
    }
}
