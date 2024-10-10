package sec2.wk07_wed;

import java.util.Arrays;
import java.util.Scanner;

public class SearchFunExtend {
    public static void main(String[] args){
        int[] data = {4, 5, 9, 7, 1, 4, 1, 4, 8, 13, 1, 7};
        if(!isSorted(data)) {
            Arrays.sort(data);
        }
        print(data);

        Scanner cin = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter a value to search: ");
            int search = cin.nextInt();
            System.out.print("Using binary search, ");
            System.out.println(search + " location: " + binarySearch(data, search));
            System.out.print("Using linear search, ");
            System.out.println(search + " location: " + linearSearch(data, search));
        }
    }

    public static int binarySearch(int[] a, int value){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(a[mid] == value){
                if(mid == 0 || a[mid - 1] != value){
                    return mid;
                }
                high = mid - 1;
//                int i = mid - 1;
//                for(; i >= 0; i--){
//                    if(a[i] != value){
//                        break;
//                    }
//                }
//                return i + 1;
                //return mid;
            } else if(value < a[mid]){
                //Left
                high = mid - 1;
            } else{
                //right
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] a, int value){
        for(int i = 0; i < a.length; i++){
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void print(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int [] a){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
