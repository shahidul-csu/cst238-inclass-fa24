package sec1.wk07_wed;

public class Queue {
    //Attributes
    private int front;
    private int back;
    private int[] data;
    public static final int CAPACITY = 7;

    public Queue(){
        front = 0;
        back = 0;
        data = new int[CAPACITY];
    }

    public boolean isEmpty(){
        return front == back;
    }

    public boolean isFull(){
        int newBack = (back + 1) % data.length;
        return newBack == front;
    }
}
