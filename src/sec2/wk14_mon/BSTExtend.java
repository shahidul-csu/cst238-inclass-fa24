package sec2.wk14_mon;

public class BSTExtend {
    Node root;

    public BSTExtend(){
        root = null;
    }

    public void inOrder(){
        if(isEmpty()){
            System.out.println("Empty BST");
        } else{
            root.inOrder();
            System.out.println();
        }
    }

    public int search(int value){
        if(isEmpty()){
            return 0;
        } else{
            return root.search(value);
        }
    }

    public void add(int value){
        if(isEmpty()){
            root = new Node(value);
        } else{
            root.add(value);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }
}

class Node{
    private int data;
    private int freq;
    private Node left;
    private Node right;

    public Node(int value){
        data = value;
        freq = 1;
        left = null;
        right = null;
    }

    public void inOrder(){
        if(hasLeft()){
            left.inOrder();
        }

        if(hasRight()){
            right.inOrder();
        }

        for(int i = 0; i < freq; i++) {
            System.out.print(data + " ");
        }
    }

    public int search(int value){
        if(value == data){
            return freq;
        } else if(value < data){
            if(hasLeft()){
                return left.search(value);
            }else{
                return 0;
            }
        } else{
            if (hasRight()){
                return right.search(value);
            } else{
                return 0;
            }
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
            } else{
                right = new Node(value);
            }
        } else{
            // a variation of BST where we keep the frequency of each value
            freq++;
        }
    }

    public boolean hasLeft(){
        return left != null;
    }
    public boolean hasRight(){
        return right != null;
    }
}