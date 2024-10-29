package sec2.wk10_mon;

public class Recursion {
    public static void main(String[] args){
//        foo();
//        counter(3);
//        System.out.println();
//        System.out.println("Sum: " + sum(3));
//        counterAdvanced(3);
        int[] data = {3, 5, 1};
//        print(data, data.length);
//        System.out.println();
        System.out.println("Max: " + maxInArray(data, 0));
        System.out.println("Sum: " + sumOfArray(data, 0));
    }

    public static int sumOfArray(int[] a, int start){
        if(start == a.length){
           return 0;
        }
        return a[start] + sumOfArray(a, start + 1);
    }

    public static int maxInArray(int[] a, int start){
        if(start == a.length - 1){
            return a[start];
        }
        return Math.max(a[start], maxInArray(a, start + 1));
//        int max = Math.max(a[start], maxInArray(a, start + 1));
//        return max;
    }

    public static void print(int[] a, int size){
        if(size == 0){
            return;
        }
        System.out.print(a[size - 1] + " ");
        print(a, size - 1);
    }

    //This method is not for Exam2, it's a heads-up for future topic
    public static void counterAdvanced(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        counterAdvanced(n - 1);
        counterAdvanced(n - 1);
    }

    //Return sum of 1 to n
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void counter(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        counter(n - 1);
        System.out.print(n + " ");
    }
    //Never Ending Method Call
    public static void foo(){
        System.out.println("in Foo");
        foo();
    }
}
