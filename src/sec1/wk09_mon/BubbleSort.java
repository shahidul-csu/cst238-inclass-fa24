package sec1.wk09_mon;

public class BubbleSort {
    public static void main(String[] args){
//        int data[] = {3, 3, 7, 9, 7, 1, 0};
        int data[] = {9, 7, 1, 2, 4, 5, 6};
//        print(data);
//        swap(data, 0, 1);
//        System.out.print("After swap: ");
        print(data);
        bubbleSort(data);
        System.out.print("After sort: ");
        print(data);
//        System.out.println(data[0] + ", " + data[1]);
//        int p = 5, q = 7;
//        badSwap(p, q);
//        System.out.println(p + ", " + q);

    }

    public static void bubbleSort(int[] a){
        for(int k = 0; k < a.length - 1; k++){
            boolean isSwapped = false;
            for(int i = 0; i < a.length - 1 - k; i++){
                if(a[i] > a[i + 1]){ //Data is out of order?
                    isSwapped = true;
                    swap(a, i, i+1);
                    System.out.print("Swapped items at " + i + ", " + (i + 1) + ": ");
                    print(a);
                }
            }
            if(!isSwapped){
                System.out.println("Sorted already! Stopping early at k = " + k);
                return;
            }
            System.out.print("Data after the iteration for k = " + k + ": ");
            print(a);
        }
    }

    public static void print(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] a, int index1, int index2){
        int temp = a[index2];
        a[index2] = a[index1];
        a[index1] = temp;
    }

    public static void badSwap(int m, int n){
        int temp = m;
        m = n;
        n= temp;
        System.out.println(m + ", " + n);
    }
}
