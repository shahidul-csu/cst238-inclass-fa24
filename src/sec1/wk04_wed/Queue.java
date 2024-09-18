package sec1.wk04_wed;

public class Queue {
    // Attributes
    private int front;
    private int back;
    private int[] data;
    public static final int DEFAULT_CAPACITY = 5;

    //Constructor
    public Queue(){
        data = new int[DEFAULT_CAPACITY];
        front = 0;
        back = 0;
    }

    //Methods
    public boolean isEmpty(){
        return front == back;
    }

    public void enqueue(int item){
        int newBack = (back + 1) % data.length;
        if(newBack == front){
            System.out.println("Queue full, cannot add " + item);
        } else{
            data[back] = item;
            back = newBack;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else{
            data[front] = 0;
            front = (front + 1) % data.length;
        }
    }

    public String toString(){
        if(isEmpty()){
            return "empty queue";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = front; i != back; i = (i + 1) % data.length){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public String arrayState(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length; i++){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
