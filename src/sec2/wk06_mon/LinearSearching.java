package sec2.wk06_mon;

import java.util.*;

public class LinearSearching {
    public static void main(String [] args){
        int size = 15;
        int[] data = new int[size];
        Random r = new Random(3);
        for(int i = 0; i < data.length; i++) {
            data[i] = getRandom(r, 1, size);
        }
        print(data);
        System.out.println("Max Value: " + max(data));
        System.out.println("Max Index: " + maxIndex(data));
        System.out.println("Max Index: " + searchAll(data, max(data)));
        Scanner in = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter a number from 1 to " + size + ": ");
            input= in.nextInt();
            int index = search(data, input);
            if(index == -1){
                System.out.println(input + " not found :(");
            } else {
                System.out.println(input + " first location: " + index);
                System.out.println(input + " last location: " + searchReverse(data, input));
                ArrayList<Integer> indices = searchAll(data, input);
                System.out.println(indices);
            }
        }while(input != 0);
    }

    public static int maxIndex(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;
//        System.out.println(maxValue);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
//                System.out.println(maxValue);
            }
        }
        return maxValue;
    }

    public static ArrayList<Integer> searchAll(int[] arr, int value){
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                indices.add(i);
            }
        }
        return indices;
    }

    public static int searchReverse(int[] arr, int value){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
//            else{
//                return -1;
//            }
        }
        return -1;
    }

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getRandom(Random r, int start, int range){
        return Math.abs(r.nextInt()) % range + start;
    }
}
