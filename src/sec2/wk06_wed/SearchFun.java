package sec2.wk06_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFun {
    public static void main(String[] args) throws IOException {
        int[] data = new int[20];
        int count = readFile(data);
        System.out.println("Is data sorted? "  + isSorted(data, count));
        print(data, count);
        int search = 6;
        boolean isSorted = isSorted(data, count);

        if(isSorted){
            System.out.println("Binary search applied");
            System.out.println(search + " location: " + binarySearch(data, count, search));
        } else{
            System.out.println("Linear search applied");
            System.out.println(search + " location: " + linearSearch(data, count, search));
        }
    }

    public static int binarySearch(int[] a, int count, int value){
        int low = 0;
        int high = count - 1;
        while(low <= high){
            int mid = (low + high)/2;
            //Test if we found it
            if(a[mid] == value){
                return mid;
            } else if(value < a[mid]){
                //left
                high = mid - 1;
            } else{
                //right
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] a, int count, int value){
        for(int i = 0; i < count; i++){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void print(int[] a, int count){
        for(int i = 0; i < count; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int [] a, int count){
        for(int i = 0; i < count - 1; i++){
            if(a[i] > a[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int readFile(int[] a) throws IOException{
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter file path and name: ");
        String filename = cin.next();
        FileReader fr = new FileReader(filename);
        Scanner fin = new Scanner(fr);
        int count = 0;
//        for(;fin.hasNextInt() && count < a.length; count++){
        while(fin.hasNextInt() && count < a.length){
            a[count] = fin.nextInt();
            count++;
        }

        fr.close();
        return count;
    }
}
