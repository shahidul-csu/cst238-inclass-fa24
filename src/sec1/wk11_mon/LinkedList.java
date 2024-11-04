package sec1.wk11_mon;

public class LinkedList {
    private Node first;
    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void append(int value){
        if(isEmpty()) {
            first = new Node(value);
        } else{
            Node current = first;
            while(current.hasNext()) {
                current = current.getNext();
            }
            // What current would point to at the end of the loop? -> Last Item
            current.setNext(new Node(value));
        }
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            Node current = first;
            while (current != null){
                sb.append(current).append(" ");
                current = current.getNext();
            }
            return sb.toString();
        }
    }
}

class Node{
    //payload
    private int data;
    // reference to the next Node in the LinkedList
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public Node getNext(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public String toString(){
        return Integer.toString(this.data);
    }
}