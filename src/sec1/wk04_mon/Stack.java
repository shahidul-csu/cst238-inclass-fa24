package sec1.wk04_mon;

public class Stack {
    private String[] data;
    private int top;
    public static final int DEFAULT_CAPACITY = 5;

    public Stack(){
        data = new String[DEFAULT_CAPACITY];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public String top(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        } else {
            return data[top];
        }
    }

    public void pop(){
        if(!isEmpty()){
            data[top] = null;
            top--;
        } else{
            System.out.println("stack is empty, cannot pop ");
        }
    }

    public void push(String item){
        if(top == data.length - 1){
            System.out.println("stack full, cannot push item " + item);
        }else{
            //top++;
            data[++top] = item;
        }
    }
}
