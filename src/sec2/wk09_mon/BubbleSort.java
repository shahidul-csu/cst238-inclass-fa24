package sec2.wk09_mon;

public class BubbleSort {
    public static void main(String [] args) {
//        int[] data = {11, 3, 5, 6, 0, 1, 5};
        int[] data = {9, 8, 0, 1, 3, 4, 6};
        print(data);
        bubbleSort(data);
        print(data);
//        swap(data, 0, 1);
//        System.out.println(data[0] +  ", " + data[1]);
//        int m = 4, n = 7;
//        badSwap(m, n);
//        System.out.println(m + ", " + n);
    }

    public static void bubbleSort(int[] a){
        for(int k = 0; k < a.length - 1; k++){
            boolean isSwap = false;
            for(int i = 0; i < a.length - 1 - k; i++){
                if(a[i] > a[i + 1]){ // If items are out of order
                    isSwap = true;
                    swap(a, i, i + 1);
//                    System.out.print("Swap items at index " + i + ", " + (i + 1) + ": ");
//                    print(a);
                }
            }
            if (!isSwap){
                System.out.println("Data is sorted already! Stopping early for k = " + k);
                break;
            }
            System.out.print("Array after loop with k = " + k + ": ");
//            System.out.println();
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
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void badSwap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + ", " + b);
    }
}
