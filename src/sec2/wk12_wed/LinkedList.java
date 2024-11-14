package sec2.wk12_wed;

public class LinkedList {
    Node first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public LinkedList prepend(int value){
        Node n = new Node(value);
        if(isEmpty()){
            first = n;
        } else{
            n.setNext(first);
            first = n;
        }
        return this;
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        Node current = first;
        while(current != null){
            sb.append(current).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}

class Node{
    //Playload
    int data;
    //Reference to the next item
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public Node getNext(){
        return this.next;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public String toString(){
        return "" + this.data;
    }
}
