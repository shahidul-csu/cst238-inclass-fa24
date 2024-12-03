package sec2.wk14_mon;

import java.util.Random;

public class BSTExtendRunner {
    public static void main(String[] args){
        BSTExtend b1 = new BSTExtend();
//        b1.add(5);
//        b1.add(3);
//        b1.add(8);
//        b1.add(7);
//        b1.add(8);
//        b1.add(8);

        Random r = new Random();

        for(int i = 0; i < 30; i++){
            b1.add(r.nextInt(10));
        }

//        for(int i = 1; i <= 6; i++){
//            b1.add(i);
//        }

        System.out.println("Freq: " + b1.search(6));
        System.out.println("Freq: " + b1.search(5));
        System.out.println("Freq: " + b1.search(8));

        b1.inOrder();
    }
}
