package sec1.wk09_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringInsertionSort {
    public static void main(String[] args) throws IOException{
        String[] data = loadStrings("src/sec1/wk09_wed/data.txt");
        print(data);
        insertionSort(data);
        print(data);
        double pi = 3.1415926;
        double rando = 5671.4317;
        System.out.printf("[%f], [%f]\n", pi, rando);
        System.out.printf("[%.2f], [%.2f]\n", pi, rando);
        System.out.printf("[%20f], [%20f]\n", pi, rando);
        System.out.printf("[%20.4f], [%20.4f]\n", pi, rando);
        System.out.printf("[%-20.4f], [%-20.4f]\n", pi, rando);
    }

    public static void insertionSort(String[] a){
        for(int i = 0; i < a.length; i++){
            int k = i;
            while(k > 0 && a[k].length() < a[k - 1].length()){
                swap(a, k, k-1);
                k--;
            }
        }
    }

    public static void swap(String [] a, int index1, int index2){
        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void print(String[] data){
        for(String word : data){
            //hello (5)
            System.out.printf("%s (%d)\n", word, word.length());
        }
        System.out.println();
    }

    public static String[] loadStrings(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner fs = new Scanner(fr);
        int count = fs.nextInt();
        String[] data =  new String[count];

        for(int i = 0; i < count; i++){
            data[i] = fs.next();
        }

        fr.close();
        return data;
    }
}
