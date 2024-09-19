package sec2.wk04_wed;

public class TestQueue {
    public static void main(String[] args){
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.arrayState());
        for(int i = 0; i < 6; i++){
            q.enqueue(i+1);
        }
        System.out.println(q);
        System.out.println(q.arrayState());
        for(int i = 0; i < 2; i++){
            q.dequeue();
        }
        System.out.println(q);
        System.out.println(q.arrayState());

        for(int i = 0; i < 3; i++){
            q.enqueue((i+1) * 11);
        }
        System.out.println(q);
        System.out.println(q.arrayState());
    }
}
