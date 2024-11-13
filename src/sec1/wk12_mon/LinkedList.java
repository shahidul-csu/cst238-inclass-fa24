package sec1.wk12_mon;

public class LinkedList {
    private Node first;

    public LinkedList(){
        first = null;
    }

    public LinkedList prepend(int data){
        Node n = new Node(data);
        if(isEmpty()){
            first = n;
        } else{
            n.setNext(first);
            first = n;
        }
        return this;
    }

    public boolean isEmpty(){
        return first == null;
    }

//    @Override
    public String toString() {
        if(isEmpty()){
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        Node current = this.first;
        while(current != null){
            sb.append(current).append("->");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}

class Node{
    //Payload
    private int data;
    //Reference to the next item
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node n){
        this.next = n;
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
