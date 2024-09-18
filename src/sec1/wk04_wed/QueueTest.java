package sec1.wk04_wed;

public class QueueTest {
    public static void main(String[] args){
        Queue q = new Queue();
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());
        for(int i = 0; i < 6; i++){
            q.enqueue(i + 1);
        }
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());

        for(int i = 0; i < 2; i++){
            q.dequeue();
        }
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());

        for(int i = 0; i < 3; i++){
            q.enqueue((i + 1) * 11);
        }
        System.out.println("Queue: " + q);
        System.out.println("Array: " + q.arrayState());
    }
}
