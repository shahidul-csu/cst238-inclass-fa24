package sec2.wk11_mon;

public class LinkedListRunner {
    public static void main(String[] args){
        LinkedList ll1 = new LinkedList();
        System.out.println(ll1.isEmpty());
        ll1.append(2);
        System.out.println(ll1);
        ll1.append(3);
        ll1.append(5);
        System.out.println(ll1);
    }
}
