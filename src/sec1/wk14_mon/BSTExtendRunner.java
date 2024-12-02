package sec1.wk14_mon;

import java.util.Random;

public class BSTExtendRunner {
    public static void main(String[] args){
        BSTExtend b1 = new BSTExtend();
//        b1.add(5);
//        b1.add(3);
//        b1.add(8);
//        b1.add(7);
//        b1.add(8);
        Random r = new Random();
        for(int i = 1; i <= 20; i++){
            b1.add(r.nextInt(100));
        }
        System.out.println("freq: " + b1.search(5));
        System.out.println("freq: " + b1.search(4));
        System.out.println("freq: " + b1.search(8));
        System.out.println("freq: " + b1.search(7));
        b1.inOrder();
    }
}
