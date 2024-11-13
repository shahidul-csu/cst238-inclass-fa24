package sec1.wk12_mon;

public class LinkedListRunner {
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        System.out.println(l1.isEmpty());
        l1.prepend(5).prepend(4).prepend(6);
        l1.prepend(7);
        l1.prepend(2);
        System.out.println(l1);
    }
}
