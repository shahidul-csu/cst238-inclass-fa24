package sec1.wk05_mon;

public class Stack {
    private char[] data;
    private int top;
    public static final int DEFAULT_CAPACITY = 10;

    public Stack(){
        data = new char[DEFAULT_CAPACITY];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public char top(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return 0;
        } else {
            return data[top];
        }
    }

    public void pop(){
        if(!isEmpty()){
            top--;
        } else{
            System.out.println("stack is empty, cannot pop ");
        }
    }

    public void push(char item){
        if(top == data.length - 1){
            System.out.println("stack full, cannot push item " + item);
        }else{
            //top++;
            data[++top] = item;
        }
    }

    public String toString() {
        if(isEmpty()){
            return "Empty Stack";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = top; i >= 0; i--){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }
}

