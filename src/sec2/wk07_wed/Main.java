package sec2.wk07_wed;

import sec1.wk07_wed.Queue;

public class Main {
    public static void main(String[] args){
        List l = new List();
        for (int i = 1; i <= 10; i++){
            l.append(i);
        }
        System.out.println(l);
        l.remove(1);
        l.remove(3);
        System.out.println(l);
        l.insert(1, 50);
//        l.append(20);
        System.out.println(l);
        System.out.println(l.sum());
        sec1.wk07_wed.Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
