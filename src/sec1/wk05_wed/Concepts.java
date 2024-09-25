package sec1.wk05_wed;

import java.util.Random;

public class Concepts {
    private int count;
    private int[] values;
    private String state;
    public static final double PI = 3.14159;

    public Concepts(int capacity){
        values = new int[capacity];
        count = 0;
        state = "Start";
    }

    public void setState(String newState){
        state = newState;
    }

    public String getState(){
        return state;
    }

    public static int getRandom(int offset, int range){
        Random r = new Random();
        int secret = Math.abs(r.nextInt()) % range + offset;
        return secret;
    }

    public static void generateRandomList(){
        Concepts c = new Concepts(7);
        c.setState("Generating Random");
//        System.out.println(c.getState());
        c.updateData();
        System.out.println(c);

        Concepts c2 = new Concepts(5);
        c2.setState("Anything");
        c2.updateData();
        System.out.println(c2);
    }

    public void updateData(){
        for(int i = 0; i < values.length; i++){
            values[i] = getRandom(1,10);
            count++;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(state).append(": ");
        for(int i = 0; i < count; i++){
            sb.append(values[i]).append(" ");
        }
        return sb.toString();
    }
}
