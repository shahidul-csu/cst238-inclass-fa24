package sec1.wk01_mon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Random rand = new Random();

        int max = 10;
        int secret = Math.abs(rand.nextInt()) % max + 1;
//        System.out.println("Rand: " + secret);

        int count = 0;
        int limit = 4;
        int [] guesses = new int[limit];

        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Enter a guess from 1 to " + max + ": ");
            int guess = scan.nextInt();
            guesses[count] = guess;
            count++;
            if(guess == secret){
                System.out.println("You guessed correctly after " + count + " attempt(s)!");
                break;
            }
            else {
                System.out.println("Your guess is wrong! Try Again!");
                System.out.println("Your have " + (limit - count) + " guess(es) left");
            }
        }while(count < limit);
        System.out.println("The secret number is: " + secret);
        System.out.println("Your Guesses: ");
        for(int i = 0; i < count; i++){
            System.out.println(guesses[i]);
        }
    }
}
