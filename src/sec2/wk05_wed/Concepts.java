package sec2.wk05_wed;

import java.util.Random;

public class Concepts {
    private int count;
    private int[] data;
    private String state;
    public static final double PI = 3.14159;

    public Concepts(int capacity){
        count = 0;
        data = new int[capacity];
        state = "Start";
    }

    public String getState(){
        return state;
    }

    public void setState(String newState){
        //Add conditions if needed
        state = newState;
    }

    public static int getRandom(int offset, int range){
        Random r = new Random();
        int secret = Math.abs(r.nextInt()) % range + offset;
        return secret;
    }

    public static void generateRandomList(){
        Concepts c1 = new Concepts(7);
        c1.populateData();
        c1.setState("P1 Random: ");
        System.out.println(c1);

        Concepts c2 = new Concepts(5);
        c2.setState("P2 Random: ");
        c2.populateData();
        System.out.println(c2);
    }

    public void populateData(){
        for(int i = 0; i < data.length; i++){
            data[i] = getRandom(1, 10);
            count++;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(state).append(": ");
        for(int i = 0; i < count; i++){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
