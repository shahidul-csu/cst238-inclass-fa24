package sec2.wk13_mon;

public class BST {
    private Node root;
    public BST(){
        root = null;
    }

    public void preOrder(){
        if (isEmpty()){
            System.out.println("Empty Tree");
        } else{
            root.preOrder();
            System.out.println();
        }
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(int value){
        if (isEmpty()){
            root = new Node(value);
        } else{
            root.add(value);
        }
    }
}

class Node{
    //Payload
    private int data;
    //Reference
    private Node left;
    private Node right;

    public Node(int value){
        data = value;
        left = null;
        right = null;
    }

    public void preOrder(){
        System.out.print(data + " ");
        if(hasLeft()) {
            left.preOrder();
        }
        if(hasRight()){
            right.preOrder();
        }
    }

    public void add(int value){
        if(value < data){
            if(hasLeft()){
                left.add(value);
            } else{
                left = new Node(value);
            }
        } else if(value > data){
            if(hasRight()){
                right.add(value);
            }else{
                right = new Node(value);
            }
        } else{
            System.out.println("BST already has " + value);
        }
    }

    public boolean hasLeft(){
        return left != null;
    }

    public boolean hasRight(){
        return right != null;
    }
}