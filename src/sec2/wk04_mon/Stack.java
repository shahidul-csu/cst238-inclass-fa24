package sec2.wk04_mon;

public class Stack {
    private String[] data;
    private int top;
    public static final int DEFAULT_CAPACITY = 5;

    public Stack(){
        top = -1;
        data = new String[DEFAULT_CAPACITY];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(String item){
        if(top == data.length - 1){
            System.out.println("Stack is full, cannot push " + item);
        } else{
//            top++;
            data[++top] = item;
//            System.out.println("Pushed " + item + " at location " + top);
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack empty, cannot pop");
        } else {
            data[top] = null;
            top--;
        }
    }

    public String top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            return data[top];
        }
    }
}
