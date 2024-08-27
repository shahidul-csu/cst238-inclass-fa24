package sec2.wk01_mon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int range = 10;
        int limit = 4;
        int count = 0;
        int [] guesses = new int[limit];
        int secret = Math.abs(rand.nextInt()) % range + 1;
        do{
            System.out.print("Enter and guess in 1 to " + range + ": ");
            int guess = in.nextInt();
            guesses[count] = guess;
            count++;
            if(guess == secret){
                System.out.println("Your guess is correct!");
                break;
            } else{
                System.out.println("Your guess is incorrect! Try again!");
                System.out.println("Your have " + (limit - count) + " guess(es) left!");
            }
        }while(count < limit);
        System.out.println("Secret: " + secret);
        System.out.println("Your Guesses: ");
        for(int i = 0; i < count; i++){
            System.out.println(guesses[i]);
        }
//        System.out.println("Hello");
    }
}
