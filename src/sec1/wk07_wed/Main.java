package sec1.wk07_wed;

public class Main {
    public static void main(String[] args){
        List l = new List();
        for(int i = 1; i <= 10; i++){
            l.append(i);
        }
        System.out.println(l);
        l.remove(7);
        l.remove(0);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.append(30);
        l.insert(1, 50);
        System.out.println(l);
        System.out.println(l.sum());

        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
