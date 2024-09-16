package sec1.wk04_mon;

public class StackTest {
    public static void main(String [] args){
        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        s1.push("A");
        System.out.println(s1.isEmpty());
        s1.push("B");
        s1.push("C");
        s1.push("D");
        s1.push("E");
        s1.pop();
        s1.pop();
        s1.push("F");
        while(!s1.isEmpty()){
            System.out.println(s1.top());
            s1.pop();
        }
        System.out.println(s1.isEmpty());
    }
}
